package e1.utils;

import java.util.Random;

public class RandomPairGenerator {

    private Random random;

    public RandomPairGenerator(){
        this.random = new Random();
    }

    public Pair<Integer, Integer> nextPair() {
        return new Pair<Integer,Integer>(this.random.nextInt(), this.random.nextInt());
    }
    
}
