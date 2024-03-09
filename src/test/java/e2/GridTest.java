package e2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.cell.Cell;
import e2.cell.CellImpl;
import e2.cell.CellType;
import e2.grid.Grid;
import e2.grid.GridImpl;

public class GridTest {

    private final int SIZE = 9;
    private final int CELL_X = 0;
    private final int CELL_Y = 0;
    private Cell[][] cells;
    private Grid grid;
    private Cell cell;
    private final int ADIACENT_MINES = 3;
    private final int MINE_X = 1;
    private final int MINE_Y = 1;
    private Cell mine;
    
    @BeforeEach
    void beforeEach(){
        cell = new CellImpl();
        mine = new CellImpl();
        mine.setType(CellType.MINE);
        cells = new Cell[SIZE][SIZE];
        cells[CELL_X][CELL_Y] = cell;
        cells[MINE_X][MINE_Y] = mine;
        grid = new GridImpl(cells);
    }
    
    @Test
    void getCellTest(){
        assertEquals(cell, grid.getCell(CELL_X, CELL_Y));
    }

    @Test
    void getAdiacentMinesTest(){
        cell.setAdiacentMines(ADIACENT_MINES);
        assertEquals(ADIACENT_MINES, grid.getAdiacentMines(CELL_X, CELL_Y).get());
    }

    @Test
    void hitTest(){
        assertAll(
            () -> assertFalse(grid.hitCell(CELL_X, CELL_Y)),
            () -> assertTrue(grid.hitCell(MINE_X, MINE_Y))
        );
    }
}
