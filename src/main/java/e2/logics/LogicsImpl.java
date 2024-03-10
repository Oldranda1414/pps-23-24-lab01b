package e2.logics;

import e2.utils.Pair;

import java.util.Optional;

import e2.grid.Grid;
import e2.grid.GridBuilderImpl;
import e2.strategy.AdiacentStrategy;

public class LogicsImpl implements Logics {

    private Grid grid;

    public LogicsImpl(final int SIZE, final int N_MINES) {
        this.grid = new GridBuilderImpl().build(SIZE, N_MINES, new AdiacentStrategy());
    }

    public LogicsImpl(Grid grid){
        this.grid = grid;
    }

    @Override
    public boolean hit(Pair<Integer, Integer> position) {
        return this.grid.hitCell(position.getX(), position.getY());
    }

    @Override
    public boolean hasMine(Pair<Integer, Integer> position) {
        return this.grid.hasMine(position.getX(), position.getY());
    }

    @Override
    public Optional<String> getCellText(Pair<Integer, Integer> position) {
        var optional = this.grid.getNumberOnCell(position.getX(), position.getY());
        if(optional.isPresent()){
            return Optional.of(Integer.toString(optional.get()));
        }
        return Optional.ofNullable(null);
    }

}
