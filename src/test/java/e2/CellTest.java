package e2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.grid.Cell;
import e2.grid.CellImpl;
import e2.grid.CellType;

public class CellTest {
    
    private Cell cell;

    @BeforeEach
    void beforeEach(){
        cell = new CellImpl();
    }

    @Test
    void initTest(){
        assertAll(
            () -> assertFalse(cell.isFlagged()),
            () -> assertEquals(CellType.EMPTY, cell.getType())
        );
    }

    @Test
    void typeTest(){
        cell.setType(CellType.MINE);
        assertEquals(CellType.MINE, cell.getType());
    }


}
