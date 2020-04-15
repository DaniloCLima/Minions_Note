package br.mack;

import br.mack.Minion.MinionDAOMySQL;

public class App {
    public static void main(final String[] args) {
        MinionDAOMySQL mysqlDAO = new MinionDAOMySQL();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario(mysqlDAO);
        interfaceUsuario.iniciar();
    }
}