package br.mack.Minion;

public class Minion {
    private String nome;
    private String parentesco;
    private String contato;
    private String facebook;
    private int valorPessoal;
    private int minionRank;
    private long idMinion;

    public Minion() {}

    public Minion(String nome, String parentesco, String contato, String facebook, int valorPessoal, int minionRank, long idMinion) {
        this.setNome(nome);
        this.setParentesco(parentesco);
        this.setContato(contato);
        this.setFacebook(facebook);
        this.setValorPessoal(valorPessoal);
        this.setMinionRank(minionRank);
        this.setIdMinion(idMinion);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public int getValorPessoal() {
        return valorPessoal;
    }

    public void setValorPessoal(int valorPessoal) {
        this.valorPessoal = valorPessoal;
    }

    public int getMinionRank() {
        return minionRank;
    }

    public void setMinionRank(int minionRank) {
        this.minionRank = minionRank;
    }

    public long getIdMinion() {
        return idMinion;
    }

    public void setIdMinion(long idMinion) {
        this.idMinion = idMinion;
    }

    @Override
    public String toString() {
        switch (valorPessoal){
            case 5:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" +
                        facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (AMOR!) " +"| Nível de Minion: " + minionRank + "]\n";
            case 4:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" +
                        facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (Carinho) " +"| Nível de Minion: " + minionRank + "]\n";
            case 3:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" +
                        facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (Indiferença) " +"| Nível de Minion: " + minionRank + "]\n";
            case 2:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" +
                        facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (Desgosto) " +"| Nível de Minion: " + minionRank + "]\n";
            case 1:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" +
                        facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (RANÇO!) " +"| Nível de Minion: " + minionRank + "]\n";
            default:
                return "#" + idMinion + " " + nome + " - " + parentesco + " [" + facebook + ", " + contato + "]\nO que você sentia por ele(a): " + valorPessoal + " - (ERROR!) " +"| Nível de Minion: " + minionRank + "]\n";
        }

    }
}

