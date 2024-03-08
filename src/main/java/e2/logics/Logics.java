package e2.logics;

import e2.utils.Pair;

public interface Logics {
    
    /**
     * @param position
     * @return whether the position contains a mine
     */
    public boolean hasMine(Pair<Integer, Integer> position);
}
