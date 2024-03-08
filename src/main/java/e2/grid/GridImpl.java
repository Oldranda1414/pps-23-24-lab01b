package e2.grid;

import java.util.ArrayList;
import java.util.Arrays;

import e1.utils.RandomPairGenerator;
import e2.utils.Pair;

public class GridImpl implements Grid{

    private int size;
    private int nMines;
    private Cell[][] cells;

    public GridImpl(int size, int nMines){
        this.size = size;
        this.nMines = nMines;
        this.cells = new Cell[this.size][this.size];
        setUpGrid();
    }

    @Override
    public Cell getCell(Pair<Integer, Integer> position) {
        return this.cells[position.getX()][position.getY()];
    }

    @Override
    public ArrayList<Cell> getAdiacentCells(Pair<Integer, Integer> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdiacentCells'");
    }

    private void setUpGrid(){
        initCellsArray();
        
        setRandomMines();

        setAdiacentNumbers();
    }

    private void initCellsArray(){
        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){
                this.cells[x][y] = new CellImpl();
            }
        }
    }

    private void setRandomMines(){
        final RandomPairGenerator RANDOM = new RandomPairGenerator(this.size);
        for(int counter = 0; counter < this.nMines; counter++){
            var pair = RANDOM.nextPair();
            var cell = this.cells[pair.getX()][pair.getY()];
            while(cell.getType().equals(CellType.MINE)){
                pair = RANDOM.nextPair();
                cell = this.cells[pair.getX()][pair.getY()];
            }
            cell.setType(CellType.MINE);
        }
    }

    private void setAdiacentNumbers(){
        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){
                if(!this.cells[x][y].getType().equals(CellType.MINE)){
                    this.cells[x][y].setAdiacentMines(countAdiacentMines(x, y));
                    this.cells[x][y].setType(CellType.NUMBER);
                }
            }
        }
    }

    private int countAdiacentMines(final int X, final int Y){
        int counter = 0;

        final int[] ADIACENT_X = {X, X - 1, X + 1};
        final int[] ADIACENT_Y = {Y, Y - 1, Y + 1};

        for(var x : ADIACENT_X){
            for(var y : ADIACENT_Y){
                if(x != X && y != Y && isValidPosition(x, y)){
                    Cell currentCell = this.cells[x][y];
                    if(currentCell.getType().equals(CellType.MINE)) counter++;
                }
            }
        }

        return counter;
    }

    private boolean isValidPosition(final int X, final int Y){

        if(X < this.size && X >= 0 && Y < this.size && Y >= 0){
            return true;
        }
        return false;
    }
    
}
