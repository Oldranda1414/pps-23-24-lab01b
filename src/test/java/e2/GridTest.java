package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.grid.Cell;
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

    @Test
    void numberOfAdiacentMinesTest(){
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                var adiacentNumber = grid.getAdiacentMines(new Pair<Integer,Integer>(x, y));
                if(adiacentNumber.isPresent()){
                    assertEquals(countAdiacentMines(x, y), adiacentNumber.get());
                }
            }
        }
    }

    private int countAdiacentMines(int X, int Y){
        int counter = 0;

        final int[] ADIACENT_X = {X, X - 1, X + 1};
        final int[] ADIACENT_Y = {Y, Y - 1, Y + 1};

        for(var x : ADIACENT_X){
            for(var y : ADIACENT_Y){
                if(x != X && y != Y && isValidPosition(x, y)){
                    Cell currentCell = grid.getCell(new Pair<Integer,Integer>(x, y));
                    if(currentCell.getType().equals(CellType.MINE)) counter++;
                }
            }
        }
        return counter;
    }

    private boolean isValidPosition(final int X, final int Y){

        if(X < SIZE && X >= 0 && Y < SIZE && Y >= 0){
            return true;
        }
        return false;
    }
}
