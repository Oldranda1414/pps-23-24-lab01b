package e2;

import org.junit.jupiter.api.BeforeEach;

public class LogicsTest {
    
    private Logics logics;
    private final int SIZE = 9;

    @BeforeEach
    void beforeEach(){
        logics = new LogicsImpl(SIZE);
    }
}
