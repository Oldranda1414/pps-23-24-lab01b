package e1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnightTest {

    private Piece knight;
    private final Pair<Integer, Integer> initialPosition = new Pair<Integer,Integer>(0,0);
    
    @BeforeEach
    void beforeEach(){
       knight = new Knight(initialPosition); 
    }

    @Test
    void correctPosition(){
        assertEquals(initialPosition, knight.getPosition());
    }
}
