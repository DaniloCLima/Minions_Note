package br.mack.Minion;

import java.util.List;

public interface MinionDAO {
    boolean create (Minion minion);
    List<Minion> read ();
    boolean update(Minion minion);
}
