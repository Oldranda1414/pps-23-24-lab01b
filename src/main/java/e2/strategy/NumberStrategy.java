package e2.strategy;

import e2.grid.Cell;

public interface NumberStrategy {

    /**
     * @return the number to display in the cell
     */
    public int calculateNumber(Cell[][] cells, int X, int Y);
}
