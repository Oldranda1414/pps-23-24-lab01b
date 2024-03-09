package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.cell.Cell;
import e2.cell.CellImpl;
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
    
    @BeforeEach
    void beforeEach(){
        cell = new CellImpl();
        cells = new Cell[SIZE][SIZE];
        cells[CELL_X][CELL_Y] = cell;
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
}
