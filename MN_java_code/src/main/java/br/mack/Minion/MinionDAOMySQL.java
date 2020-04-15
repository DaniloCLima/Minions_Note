package br.mack.Minion;

import br.mack.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MinionDAOMySQL implements MinionDAO {
    private String createSQL = "INSERT INTO `Minions_Note`.`Minion` (`nome`, `parentesco`, `contato`, `facebook`, `valorPessoal`, `minionRank`) VALUES (?, ?, ?, ?, ?, ?);";
    private String readSQL = "SELECT * FROM Minion";
    private String updateSQL = "UPDATE Minion SET contato=?, valorPessoal=?  WHERE idMinion=?";

    private final MySQLConnection mysql = new MySQLConnection();

    public boolean create(Minion minion) {
        Connection conexao = mysql.getConnection();
        try {
            PreparedStatement stm = conexao.prepareStatement(createSQL);

            stm.setString(1, minion.getNome());
            stm.setString(2, minion.getParentesco());
            stm.setString(3, minion.getContato());
            stm.setString(4, minion.getFacebook());
            stm.setInt(5, minion.getValorPessoal());
            stm.setInt(6, minion.getMinionRank());

            int registros = stm.executeUpdate();

            return registros > 0 ? true : false;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public List<Minion> read() {
        Connection conexao = mysql.getConnection();
        List<Minion> minions = new ArrayList();

        try {
            PreparedStatement stm = conexao.prepareStatement(readSQL);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Minion minion = new Minion();
                minion.setNome(rs.getString("nome"));
                minion.setParentesco(rs.getString("parentesco"));
                minion.setContato(rs.getString("contato"));
                minion.setFacebook(rs.getString("facebook"));
                minion.setValorPessoal(rs.getInt("valorPessoal"));
                minion.setMinionRank(rs.getInt("minionRank"));
                minion.setIdMinion(rs.getLong("idMinion"));
                minions.add(minion);
            }

            return minions;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return minions;
    }

    public boolean update(Minion minion) {
        Connection conexao = mysql.getConnection();
        try {
            PreparedStatement stm = conexao.prepareStatement(updateSQL);

            stm.setString(1, minion.getContato());
            stm.setInt(2, minion.getValorPessoal());
            stm.setLong(3, minion.getIdMinion());

            int registros = stm.executeUpdate();

            return registros > 0 ? true : false;

        } catch (final SQLException ex) {
            System.out.println("Falha de conexão com a base de dados!");
            ex.printStackTrace();
        } catch (final Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                conexao.close();
            } catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

}
