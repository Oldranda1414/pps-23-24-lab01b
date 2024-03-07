package e1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import e1.utils.Pair;
import e1.utils.RandomPairGenerator;

public class RandomPairGeneratorTest {
    
    private RandomPairGenerator random;

    @BeforeEach
    void BeforeEach(){
        random = new RandomPairGenerator();
    }

    @Test
    void getPairTest(){
        final Pair<Integer, Integer> pair = new Pair<>(null, null);
        assertAll(
            () -> assertEquals(pair.getClass(), random.nextPair().getClass()),
            () -> assertEquals(pair.getClass(), random.nextPair().getClass()),
            () -> assertEquals(pair.getClass(), random.nextPair().getClass())
        );
    }
}
