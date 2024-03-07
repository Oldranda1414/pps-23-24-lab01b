package e1;

public class BoardImpl implements Board{

    private Piece piece;
    private Pair<Integer, Integer> target; 

    public BoardImpl(Piece piece, Pair<Integer, Integer> target){
        this.piece = piece;
        this.target = target;
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'movePiece'");
    }

    @Override
    public Pair<Integer, Integer> getPiecePosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPiecePosition'");
    }

    @Override
    public Pair<Integer, Integer> getTargetPosition() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTargetPosition'");
    }
    
}
