package e2;

import org.junit.jupiter.api.BeforeEach;

import e2.grid.Cell;
import e2.grid.CellImpl;

public class CellTest {
    
    private Cell cell;

    @BeforeEach
    void beforeEach(){
        cell = new CellImpl();
    }
}
