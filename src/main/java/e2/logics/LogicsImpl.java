package e2.logics;

import e2.utils.Pair;

import java.util.ArrayList;

import e2.grid.Grid;
import e2.grid.GridBuilderImpl;
import e2.strategy.AdiacentStrategy;

public class LogicsImpl implements Logics {

    private Grid grid;

    public LogicsImpl(final int SIZE, final int N_MINES) {
        this.grid = new GridBuilderImpl().build(SIZE, N_MINES, new AdiacentStrategy());
    }

    @Override
    public boolean hit(Pair<Integer, Integer> position) {
        return this.grid.hitCell(position.getX(), position.getY());
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getMinesPosition() {
        return this.grid.getMinesPositions();
    }

}
