package e2.grid;

import java.util.Optional;

import e2.cell.Cell;

public class GridImpl implements Grid{
    
    private Cell[][] cells;
    
    public GridImpl(Cell[][] cells){
        this.cells = cells;
    }
    
    @Override
    public Optional<Integer> getNumberOnCell(final int X, final int Y) {
        return this.cells[X][Y].getNumber();
    }

    @Override
    public boolean hitCell(int X, int Y) {
        boolean isMine = this.cells[X][Y].isMine();
        if(!isMine) this.cells[X][Y].setVisible(true);
        return isMine;
    }

    @Override
    public boolean hasMine(int X, int Y) {
        return this.cells[X][Y].isMine();
    }

}
