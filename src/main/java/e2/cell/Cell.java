package e2.cell;

import java.util.Optional;

public interface Cell {

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

    /**
     * getter for private attribute visible
     * @return
     */
    public boolean isVisible();

    /**
     * setter for private attribute visible
     * @param bool
     */
    public void setVisible(boolean bool);

    /**
     * getter for private attribute isMine
     * @return
     */
    public boolean isMine();

    /**
     * setter for private attribute isMine
     * @return
     */
    public void setIsMine(boolean bool);
}
