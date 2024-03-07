package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer,Integer> pawn;
	private final Piece knight;
	private final Board board;
	private final Random random; 
	private final int size;
	 
    public LogicsImpl(int size){
		this.random = new Random();
    	this.size = size;
        this.pawn = this.randomEmptyPosition();
        this.knight = new Knight(this.randomEmptyPosition());
		this.board = new BoardImpl(this.knight, this.pawn, new Pair<>(size, size));
    }

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer, Integer> knight){
		this.random = new Random();
    	this.size = size;
        this.pawn = pawn;
        this.knight = new Knight(knight);
		this.board = new BoardImpl(this.knight, this.pawn, new Pair<>(size, size));
	}
    
	private final Pair<Integer,Integer> randomEmptyPosition(){
    	Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    	// the recursive call below prevents clash with an existing pawn
    	return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }
    
	@Override
	public boolean hit(int row, int col) {
		final Pair<Integer, Integer> movement = new Pair<>(row, col);
		this.board.movePiece(movement);
		final Pair<Integer, Integer> piecePosition = this.board.getPiecePosition();
		final Pair<Integer, Integer> pawnPosition = this.board.getTargetPosition();
		return piecePosition.equals(pawnPosition);
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.board.hasPiece(new Pair<Integer,Integer>(row, col));	
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.board.hasTarget(new Pair<Integer,Integer>(row, col));	
	}
}
