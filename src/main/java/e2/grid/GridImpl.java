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

    @Override
    public boolean hitCell(int X, int Y) {
        boolean isMine = this.cells[X][Y].isMine();
        if(!isMine) this.cells[X][Y].setVisible(true);
        return isMine;
    }

}
