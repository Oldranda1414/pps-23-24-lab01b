package e2.grid;

import e2.utils.Pair;

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
}
