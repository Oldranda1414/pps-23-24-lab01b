package e2;

import org.junit.jupiter.api.BeforeEach;

import e2.grid.Grid;
import e2.grid.GridImpl;

public class GridTest {

    private final int SIZE = 9;
    private Grid grid;
    
    @BeforeEach
    void beforeEach(){
        grid = new GridImpl(SIZE);
    }
}
