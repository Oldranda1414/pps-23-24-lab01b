package e2.logics;

import java.util.ArrayList;
import java.util.Random;

import e2.utils.Pair;
import e2.grid.Cell;
import e2.grid.CellType;
import e2.grid.Grid;
import e2.grid.GridImpl;

//TODO CHECK IF NON RANDOM CONSTRUCTOR IS USED
//TODO CHECK IF SIZE AND N_MINES ATTRIBUITES ARE NECESSARY
public class LogicsImpl implements Logics {

    private int SIZE;
    private int N_MINES;
    private Grid grid;

    public LogicsImpl(final int SIZE, final int N_MINES) {
        this.SIZE = SIZE;
        this.N_MINES = N_MINES;
        this.grid = new GridImpl(this.SIZE, this.N_MINES);
    }

    public LogicsImpl(final int SIZE, final int N_MINES, Grid grid) {
        this.SIZE = SIZE;
        this.N_MINES = N_MINES;
        this.grid = grid;
    }

    @Override
    public boolean hasMine(Pair<Integer, Integer> position) {
        Cell cell = this.grid.getCell(position.getX(), position.getY());
        return cell.getType().equals(CellType.MINE);
    }

}
