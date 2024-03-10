package e2.grid;

import java.util.Optional;

import e2.cell.Cell;
import e2.revealStrategy.RevealStrategy;
import e2.revealStrategy.RevealStrategyImpl;

public class GridImpl implements Grid{
    
    private Cell[][] cells;
    private RevealStrategy strategy = new RevealStrategyImpl();
    
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
        if(!isMine){
            this.strategy.revealCell(cells, X, Y);
        } 
        return isMine;
    }

    @Override
    public boolean hasMine(int X, int Y) {
        return this.cells[X][Y].isMine();
    }

    @Override
    public boolean isVisible(int X, int Y) {
        return this.cells[X][Y].isVisible();
    }

}
