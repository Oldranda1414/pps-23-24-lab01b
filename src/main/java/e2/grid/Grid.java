package e2.grid;

import java.util.Optional;

import e2.cell.Cell;

public interface Grid {
    
    public Cell getCell(final int X, final int Y);
    
    public Optional<Integer> getAdiacentMines(final int X, final int Y);
}
