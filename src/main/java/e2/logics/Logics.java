package e2.logics;

import java.util.ArrayList;

import e2.utils.Pair;

public interface Logics {
    
    /**
     * sets the cell to visible, and checks if the cell was a mine
     * @param position
     * @return whether the position contains a mine
     */
    public boolean hit(Pair<Integer, Integer> position);

    public ArrayList<Pair<Integer, Integer>> getMinesPosition();

}
