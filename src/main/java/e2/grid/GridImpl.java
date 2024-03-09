package e2.grid;

import java.util.ArrayList;
import java.util.Optional;

import e2.cell.Cell;
import e2.utils.Pair;

public class GridImpl implements Grid{
    
    private Cell[][] cells;
    
    public GridImpl(Cell[][] cells){
        this.cells = cells;
    }
    
    @Override
    public Cell getCell(final int X, final int Y) {
        return this.cells[X][Y];
    }
    
    @Override
    public Optional<Integer> getAdiacentMines(final int X, final int Y) {
        return this.cells[X][Y].getAdiacentMines();
    }

    @Override
    public boolean hitCell(int X, int Y) {
        boolean isMine = this.cells[X][Y].isMine();
        if(!isMine) this.cells[X][Y].setVisible(true);
        return isMine;
    }

    @Override
    public ArrayList<Pair<Integer, Integer>> getMines() {
        var mines = new ArrayList<Pair<Integer, Integer>>();
        for(int x = 0; x < this.cells.length; x++){
            for(int y = 0; y < this.cells[0].length; y++){
                if(this.cells[x][y].isMine()){
                    mines.add(new Pair<Integer,Integer>(x, y));
                }
            }
        }
        return mines;
    }

}
