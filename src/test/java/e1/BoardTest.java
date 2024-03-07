package e1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {

    private Board board;
    private Pair<Integer, Integer> piecePosition = new Pair<>(0,0);
    private Piece piece = new Knight(piecePosition);
    private Pair<Integer, Integer> target = new Pair<>(3,3);
    
    @BeforeEach
    void beforeEach(){
        board = new BoardImpl(piece, target);
    }

    @Test
    void testHas(){
        assertAll(
            () -> assertTrue(board.hasPiece(piecePosition)),
            () -> assertTrue(board.hasTarget(target)),
            () -> assertFalse(board.hasPiece(target)),
            () -> assertFalse(board.hasTarget(piecePosition))
        );
    }
}
