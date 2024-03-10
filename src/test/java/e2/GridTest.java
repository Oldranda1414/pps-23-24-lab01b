package e2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//TODO TEST THROWS OUT OF BOUNDS EXEPTION
public class GridTest extends DefaultGrid{

    @BeforeEach
    void beforeEach(){
        setup();
    }
    
    @Test
    void getNumberOnCellTest(){
        firstCell.setNumber(ADIACENT_MINES);
        assertEquals(ADIACENT_MINES, grid.getNumberOnCell(CELL_X, CELL_Y).get());
    }

    @Test
    void hitTest(){
        assertAll(
            () -> assertFalse(grid.hitCell(CELL_X, CELL_Y)),
            () -> assertTrue(grid.hitCell(MINE_X, MINE_Y))
        );
    }

    @Test 
    void hasMineTest(){
        assertAll(
            () -> assertFalse(grid.hitCell(CELL_X, CELL_Y)),
            () -> assertTrue(grid.hitCell(MINE_X, MINE_Y))
        );
    }

    @Test
    void isVisibleTest(){
        grid.hitCell(CELL_X, CELL_Y);
        assertAll(
            () -> assertTrue(grid.isVisible(CELL_X, CELL_Y)),
            () -> assertFalse(grid.isVisible(SECOND_CELL_X, SECOND_CELL_Y))
        );
    }

}
