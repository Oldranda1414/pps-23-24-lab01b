package e2.cell;

import java.util.Optional;

public interface Cell {

    /**
     * getter for private attribute type
     * @return
     */
    public CellType getType();

    /**
     * setter for private attribute type
     * @param type
     */
    public void setType(CellType type);

    /**
     * getter for private attribute flag
     * @return
     */
    public boolean isFlagged();

    /**
     * setter for private attribute flag
     * @param bool
     */
    public void setFlag(boolean bool);

    /**
     * getter for private attribute adiacentMines
     * @return
     */
    public Optional<Integer> getAdiacentMines();

    /**
     * setter for private attribute adiacentMines
     * @param adiacentMines
     */
    public void setAdiacentMines(int adiacentMines);
}
