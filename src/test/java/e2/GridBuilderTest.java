package e2;

import org.junit.jupiter.api.BeforeEach;

import e2.grid.GridBuilder;
import e2.grid.GridBuilderImpl;

public class GridBuilderTest {
    
    private GridBuilder builder;

    @BeforeEach
    void beforeEach(){
        builder = new GridBuilderImpl();
    }

}
