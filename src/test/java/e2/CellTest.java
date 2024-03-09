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

public class CellTest {
    
    private Cell cell;
    private final int ADIACENT_MINES = 3;

    @BeforeEach
    void beforeEach(){
        cell = new CellImpl();
    }

    @Test
    void initTest(){
        assertAll(
            () -> assertFalse(cell.isFlagged()),
            () -> assertEquals(CellType.EMPTY, cell.getType()),
            () -> assertFalse(cell.getAdiacentMines().isPresent())
        );
    }

    @Test
    void typeTest(){
        cell.setType(CellType.MINE);
        assertEquals(CellType.MINE, cell.getType());
    }

    @Test
    void flagTest(){
        cell.setFlag(true);
        assertTrue(cell.isFlagged());
    }

    @Test void adiacentMinesTest(){
        cell.setAdiacentMines(ADIACENT_MINES);
        assertEquals(ADIACENT_MINES, cell.getAdiacentMines().get());
    }
}
