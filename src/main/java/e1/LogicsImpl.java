package e1;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer,Integer> pawn;
	private final Piece knight;
	private final Random random; 
	private final int size;
	 
    public LogicsImpl(int size){
		this.random = new Random();
    	this.size = size;
        this.pawn = this.randomEmptyPosition();
        this.knight = new Knight(this.randomEmptyPosition());
    }

	public LogicsImpl(int size, Pair<Integer, Integer> pawn, Pair<Integer, Integer> knight){
		this.random = new Random();
    	this.size = size;
        this.pawn = pawn;
        this.knight = new Knight(knight);
	}
    
	private final Pair<Integer,Integer> randomEmptyPosition(){
    	Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
    	// the recursive call below prevents clash with an existing pawn
    	return this.pawn!=null && this.pawn.equals(pos) ? randomEmptyPosition() : pos;
    }
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		// Below a compact way to express allowed moves for the knight
		if(this.knight.move(new Pair<Integer,Integer>(row, col))){
			return this.pawn.equals(this.knight.getPosition());
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.getPosition().equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
