package e2.logics;

import java.util.Optional;

import e2.utils.Pair;

public interface Logics {
    
    /**
     * sets the cell to visible, and checks if the cell was a mine
     * @param position
     * @return whether the position contains a mine
     */
    public boolean hit(Pair<Integer, Integer> position);

    /**
     * @param position
     * @return true if the cell at position is a mine, false otherwise
     */
    public boolean hasMine(Pair<Integer, Integer> position);

    /**
     * @param position
     * @return number on the cell at position, null if cell has no number
     */
    public Optional<String> getCellText(Pair<Integer, Integer> position);
}
