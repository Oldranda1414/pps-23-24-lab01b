package e2.grid;

import java.util.Optional;
import java.util.ArrayList;

import e2.cell.Cell;
import e2.utils.Pair;

public interface Grid {
    
    public Cell getCell(final int X, final int Y);
    
    public Optional<Integer> getAdiacentMines(final int X, final int Y);

    public boolean hitCell(final int X, final int Y);

    public ArrayList<Pair<Integer, Integer>> getMinesPositions();
}
