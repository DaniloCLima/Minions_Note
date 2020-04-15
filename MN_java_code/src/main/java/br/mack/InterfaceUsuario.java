package br.mack;

import br.mack.Minion.Minion;
import br.mack.Minion.MinionDAO;

import java.util.List;
import java.util.Scanner;

public class InterfaceUsuario {
    MinionDAO dao;
    Scanner in;

    public InterfaceUsuario(MinionDAO dao) {
        this.dao = dao;
        this.in = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Você abriu o seu Minion' Note.");
        System.out.println("Pegue sua caneta e começe os registros...");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();
        imprimirMenu();
    }

    private void imprimirMenu() {
        int opc = 0;
        do {
            System.out.println("#################################");
            System.out.println("#### O QUE FAZER NO CADERNO? ####");
            System.out.println("#################################");
            System.out.println("\t1. Escrever no Caderno");
            System.out.println("\t2. Ler Lista de Nome");
            System.out.println("\t3. Reescrever Dado");
            System.out.println("\t4. Sair");
            System.out.print("Escolha uma opção: ");
            opc = in.nextInt();

            in.nextLine();

            switch (opc) {
                case 1:
                    this.create();
                    break;
                case 2:
                    this.read();
                    break;
                case 3:
                    this.update();
                    break;
                case 4:
                    System.out.println("Até o próximo...");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (opc != 4);
    }

    private void create() {
        Minion minion = new Minion();

        System.out.println("\n###################");
        System.out.println("### NOVO MINION ###");
        System.out.println("###################");

        System.out.print("\nEscreva o nome completo do Minion: ");
        minion.setNome(in.nextLine());
        System.out.println("Este nome *NUNCA* sairá do caderno...");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();

        System.out.print("Escreva seu parentesco com o Minion: ");
        minion.setParentesco(in.nextLine());


        System.out.print("Escreva o contato do Minion (Ex.: (11) 96666-6666): ");
        minion.setContato(in.nextLine());

        System.out.print("Guarde o link da arma de Fake News do Minion (Facebook): ");
        minion.setFacebook(in.nextLine());

        System.out.println("\nDe (5) à (1), onde: ");
        System.out.println("5 = AMOR!");
        System.out.println("4 = Carinho");
        System.out.println("3 = Indiferença");
        System.out.println("2 = Desgosto");
        System.out.println("1 = RANÇO!");
        System.out.print("Escreva o nível de afeto que sentia pelo Minion: ");
        minion.setValorPessoal(in.nextInt());

        System.out.println("\nDe (5) à (1), onde: ");
        System.out.println("5 = EXTREMAMENTE MINION!");
        System.out.println("1 = Minion");
        System.out.print("Escreva o nível de ameaça Minion que este Minion representa: ");
        minion.setMinionRank(in.nextInt());

        System.out.println("\nEscrevendo...");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();

        if (dao.create(minion)) {
            System.out.println("Minion registrado no Minion's Note.\n");
        } else {
            System.out.println("Parece que você não sabe escrever, tente novamente depois de mais estudo.\n");
        }
    }

    private void read() {
        System.out.println("Espere...");

        List<Minion> minions = dao.read();

        System.out.println("\n######################################");
        System.out.println("#### Lista de Minions Registrados ####");
        System.out.println("######################################");
        for(Minion minion : minions) {
            System.out.println(minion);

        }
    }

    private void update() {
        Minion minion = new Minion();

        System.out.println("\nVOCÊ SÓ PODE REESCREVER O CONTATO DO MINION!");
        System.out.println("(Eles sempre encontram um novo contato para te incomodar...)");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();
        System.out.println("Mas também pode reescrever seu afeto por ele");
        System.out.println("(Nunca se sabe quando o amor pode virar ranço...)");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();
        System.out.println("Espere...");

        List<Minion> minions = dao.read();
        for(Minion minion1 : minions) {
            System.out.println(minion1);
        }

        System.out.println("##################################");
        System.out.println("#### Reescreva os Novos Dados ####");
        System.out.println("##################################");

        System.out.print("Selecione o Minion para modificar os dados pela sua posição no caderno: #");
        minion.setIdMinion(in.nextLong());

        in.nextLine();
        System.out.print("\nReescreva o contato do Minion (Ex.: (11) 96666-6666): ");
        minion.setContato(in.nextLine());


        System.out.print("Reescreva o nível de afeto pelo minion, mas lembre-se:");
        System.out.println("\nDe (5) à (1): ");
        System.out.println("5 = AMOR!");
        System.out.println("4 = Carinho");
        System.out.println("3 = Indiferença");
        System.out.println("2 = Desgosto");
        System.out.println("1 = RANÇO!");
        System.out.print("O nível de seu afeto é: ");
        minion.setValorPessoal(in.nextInt());

        System.out.println("\nRabiscando e reescrevendo...");
        System.out.println("(Aperte enter para continuar)");
        in.nextLine();

        if (dao.update(minion)) {
            System.out.println("\nDados antigos rabiscados e novos dados registrados...\n");
        } else {
            System.out.println("Parece que você não sabe escrever, tente novamente depois de mais estudo.\n");
        }
    }

    }
