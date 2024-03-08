package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.grid.CellType;
import e2.grid.Grid;
import e2.grid.GridImpl;
import e2.utils.Pair;

public class GridTest {

    private final int SIZE = 9;
    private final int N_MINES = 3;
    private Grid grid;
    
    @BeforeEach
    void beforeEach(){
        grid = new GridImpl(SIZE, N_MINES);
    }
    
    @Test
    void initTest(){
        int minesCounter = 0;
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                var cell = grid.getCell(new Pair<>(x, y));
                if(cell.getType().equals(CellType.MINE)){
                    minesCounter++;
                }
            }
        }
       assertEquals(N_MINES, minesCounter); 
    }
}
