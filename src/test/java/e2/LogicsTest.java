package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.logics.Logics;
import e2.logics.LogicsImpl;
import e2.utils.Pair;

public class LogicsTest {
    
    private Logics logics;
    private final int SIZE = 9;
    private final int N_MINES = 4;

    @BeforeEach
    void beforeEach(){
        logics = new LogicsImpl(SIZE, N_MINES);
    }

    @Test
    void testMineGeneration(){
        int minesCounter = 0;
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                if(logics.hasMine(new Pair<>(x,y)))minesCounter++;
            }
        }
       assertEquals(N_MINES, minesCounter); 
    }
}
