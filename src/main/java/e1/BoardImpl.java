package e1;

public class BoardImpl implements Board{

    private Piece piece;
    private Pair<Integer, Integer> target; 
    private Pair<Integer, Integer> dimensions; 

    public BoardImpl(Piece piece, Pair<Integer, Integer> target, Pair<Integer, Integer> dimensions){
        this.piece = piece;
        this.target = target;
        this.dimensions = dimensions;
    }

    @Override
    public boolean hasPiece(Pair<Integer, Integer> position) {
        return this.piece.getPosition().equals(position);
    }

    @Override
    public boolean hasTarget(Pair<Integer, Integer> position) {
       return this.target.equals(position); 
    }

    @Override
    public boolean movePiece(Pair<Integer, Integer> newPosition) {
        final int newX = newPosition.getX();
        final int newY = newPosition.getY();
        if(newX >= 0 && newX < this.dimensions.getX() && newY >= 0 && newY < this.dimensions.getY()){
            return this.piece.move(newPosition);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Pair<Integer, Integer> getPiecePosition() {
        return this.piece.getPosition();
    }

    @Override
    public Pair<Integer, Integer> getTargetPosition() {
        return this.target;
    }
    
}
