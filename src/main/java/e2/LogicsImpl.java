package e2;

import java.util.ArrayList;
import java.util.Random;

public class LogicsImpl implements Logics {

    private int SIZE;
    private int N_MINES;
    private ArrayList<Pair<Integer, Integer>> mines;

    public LogicsImpl(final int SIZE, final int N_MINES) {
        this.SIZE = SIZE;
        this.N_MINES = N_MINES;
        this.mines = new ArrayList<Pair<Integer, Integer>>();
        generateRandomMines();
    }

    public LogicsImpl(final int SIZE, final int N_MINES, ArrayList<Pair<Integer, Integer>> mines) {
        this.SIZE = SIZE;
        this.N_MINES = N_MINES;
        this.mines = mines;
    }

    @Override
    public boolean hasMine(Pair<Integer, Integer> position) {
        return this.mines.contains(position);
    }

    private void generateRandomMines(){
        for(int i = 0; i < this.N_MINES; i++){
            this.mines.add(generateRandomMine());
        }
    }

    private Pair<Integer, Integer> generateRandomMine(){
        final Random random = new Random();
        final var pair = new Pair<>(random.nextInt(SIZE), random.nextInt(SIZE));
        return this.mines.contains(pair) ? generateRandomMine() : pair;
    }

}
