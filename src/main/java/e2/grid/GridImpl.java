package e2.grid;

import java.util.Optional;

import e2.utils.RandomPairGenerator;
import e2.strategy.NumberStrategy;
import e2.utils.Pair;

public class GridImpl implements Grid{
    
    private int size;
    private int nMines;
    private Cell[][] cells;
    private NumberStrategy strategy;
    
    public GridImpl(int size, int nMines, NumberStrategy strategy){
        this.size = size;
        this.nMines = nMines;
        this.cells = new Cell[this.size][this.size];
        this.strategy = strategy;
        setUpGrid();
    }
    
    @Override
    public Cell getCell(final int X, final int Y) {
        return this.cells[X][Y];
    }
    
    @Override
    public Optional<Integer> getAdiacentMines(final int X, final int Y) {
        return this.cells[X][Y].getAdiacentMines();
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
            Pair<Integer, Integer> pair;
            Cell cell;
            do{
                pair = RANDOM.nextPair();
                cell = this.cells[pair.getX()][pair.getY()];
            }while(cell.getType().equals(CellType.MINE));
            cell.setType(CellType.MINE);
        }
    }

    private void setAdiacentNumbers(){
        for(int x = 0; x < this.size; x++){
            for(int y = 0; y < this.size; y++){
                if(!this.cells[x][y].getType().equals(CellType.MINE)){
                    final int cellNumber = this.strategy.calculateNumber(this.cells, x, y);
                    if(cellNumber != 0){
                        this.cells[x][y].setType(CellType.NUMBER);
                        this.cells[x][y].setAdiacentMines(cellNumber);
                    }
                }
            }
        }
    }

}
