package e2.grid;

import java.util.Optional;

public interface Grid {
    
    public Cell getCell(final int X, final int Y);
    
    public Optional<Integer> getAdiacentMines(final int X, final int Y);
}
