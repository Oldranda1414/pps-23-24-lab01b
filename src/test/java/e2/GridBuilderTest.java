package e2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e2.cell.Cell;
import e2.cell.CellType;
import e2.grid.Grid;
import e2.grid.GridBuilder;
import e2.grid.GridBuilderImpl;
import e2.strategy.AdiacentStrategy;
import e2.strategy.NumberStrategy;

public class GridBuilderTest {
    
    private GridBuilder builder;
    private Grid grid;
    private final int SIZE = 7;
    private final int N_MINES = 10;
    private final NumberStrategy STRATEGY = new AdiacentStrategy();

    @BeforeEach
    void beforeEach(){
        builder = new GridBuilderImpl();
        grid = builder.build(SIZE, N_MINES, STRATEGY);
    }

    @Test
    void initTest(){
        int minesCounter = 0;
        for(int x = 0; x < SIZE; x++){
            for(int y = 0; y < SIZE; y++){
                var cell = grid.getCell(x, y);
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
                var adiacentNumber = grid.getAdiacentMines(x, y);
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
                    Cell currentCell = grid.getCell(x, y);
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
