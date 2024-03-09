package e2.logics;

import e2.utils.Pair;
import e2.cell.Cell;
import e2.cell.CellType;
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
        Cell cell = this.grid.getCell(position.getX(), position.getY());
        return cell.getType().equals(CellType.MINE);
    }

}
