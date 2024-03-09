package e2;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.cell.Cell;
import e2.cell.CellImpl;
import e2.grid.Grid;
import e2.grid.GridImpl;
import e2.utils.Pair;

public class GridTest {

    private final int SIZE = 2;
    private final int CELL_X = 0;
    private final int CELL_Y = 0;
    private Cell[][] cells;
    private Grid grid;
    private Cell firstCell;
    private final int ADIACENT_MINES = 3;
    private final int MINE_X = 1;
    private final int MINE_Y = 1;
    private Cell mine;
    
    @BeforeEach
    void beforeEach(){
        firstCell = new CellImpl();
        var secondCell = new CellImpl();
        var thirdCell = new CellImpl();
        final int SECOND_CELL_X = 0;
        final int SECOND_CELL_Y = 1;
        final int THIRD_CELL_X = 1;
        final int THIRD_CELL_Y = 0;
        mine = new CellImpl();
        mine.setIsMine(true);
        cells = new Cell[SIZE][SIZE];
        cells[CELL_X][CELL_Y] = firstCell;
        cells[MINE_X][MINE_Y] = mine;
        cells[SECOND_CELL_X][SECOND_CELL_Y] = secondCell;
        cells[THIRD_CELL_X][THIRD_CELL_Y] = thirdCell;
        grid = new GridImpl(cells);
    }
    
    @Test
    void getCellTest(){
        assertEquals(firstCell, grid.getCell(CELL_X, CELL_Y));
    }

    @Test
    void getAdiacentMinesTest(){
        firstCell.setAdiacentMines(ADIACENT_MINES);
        assertEquals(ADIACENT_MINES, grid.getAdiacentMines(CELL_X, CELL_Y).get());
    }

    @Test
    void hitTest(){
        assertAll(
            () -> assertFalse(grid.hitCell(CELL_X, CELL_Y)),
            () -> assertTrue(grid.hitCell(MINE_X, MINE_Y))
        );
    }

    @Test
    void getMinePositionsTest(){
        var pair = new Pair<Integer,Integer>(MINE_X, MINE_Y);
        var mines = new ArrayList<Pair<Integer, Integer>>();
        mines.add(pair);
        assertEquals(mines, grid.getMines());
    }
}
