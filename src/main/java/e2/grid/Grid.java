package e2.grid;

import e2.utils.Pair;

public interface Grid {
    
    public Cell getCell(Pair<Integer, Integer> position);
    
    public int getAdiacentMines(Pair<Integer, Integer> position);
}
