package e2.grid;

import java.util.Optional;

import e2.utils.Pair;

public interface Grid {
    
    public Cell getCell(Pair<Integer, Integer> position);
    
    public Optional<Integer> getAdiacentMines(Pair<Integer, Integer> position);
}
