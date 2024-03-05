package e1;

public class Knight implements Piece {

    private Pair<Integer, Integer> position;

    public Knight(Pair<Integer, Integer> position){
       this.position = position;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return this.position;
    }

    @Override
    public boolean move(Pair<Integer, Integer> newPosition) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }
    
}
