package e1;

import org.junit.jupiter.api.BeforeEach;

public class BoardTest {

    private Board board;
    
    @BeforeEach
    void beforeEach(){
        board = new BoardImpl();
    }

}
