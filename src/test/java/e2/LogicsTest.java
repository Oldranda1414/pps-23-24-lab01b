package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

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
    void hitTest(){
        int minesCounter = 0;
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                if(logics.hit(new Pair<>(x,y)))minesCounter++;
            }
        }
        assertEquals(N_MINES, minesCounter); 
    }

    @Test
    void getMinesTest(){
        var mines = new ArrayList<Pair<Integer, Integer>>();
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                if(logics.hit(new Pair<>(x,y))){
                    mines.add(new Pair<Integer,Integer>(x, y));
                }
            }
        }
        assertEquals(mines, logics.getMinesPosition());
    }
}
