package e1;

public interface Piece {

    /**
     * @return the position of the piece
     */
    public Pair<Integer, Integer> getPosition();

    /**
     * attempt to move the piece, if it is possible
     * @param newPosition the position the piece is being moved to
     * @return true if the movement is executed, false otherwise
     */
    public boolean move(Pair<Integer, Integer> newPosition);

}
