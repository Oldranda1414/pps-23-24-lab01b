package e2.grid;

import java.util.Optional;

import e2.cell.Cell;

public class GridImpl implements Grid{
    
    private Cell[][] cells;
    
    public GridImpl(Cell[][] cells){
        this.cells = cells;
    }
    
    @Override
    public Cell getCell(final int X, final int Y) {
        return this.cells[X][Y];
    }
    
    @Override
    public Optional<Integer> getAdiacentMines(final int X, final int Y) {
        return this.cells[X][Y].getAdiacentMines();
    }

}
