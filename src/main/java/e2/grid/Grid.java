package e2.grid;

import java.util.ArrayList;

import e2.utils.Pair;

public interface Grid {
    
    public Cell getCell(Pair<Integer, Integer> position);
    
    public ArrayList<Cell> getAdiacentCells(Pair<Integer, Integer> position);
}
