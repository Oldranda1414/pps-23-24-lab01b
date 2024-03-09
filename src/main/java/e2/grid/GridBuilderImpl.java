package e2.grid;

import e2.cell.Cell;
import e2.cell.CellImpl;
import e2.cell.CellType;
import e2.strategy.NumberStrategy;
import e2.utils.Pair;
import e2.utils.RandomPairGenerator;

public class GridBuilderImpl implements GridBuilder{

    @Override
    public Grid build(final int SIZE, final int N_MINES, final NumberStrategy STRATEGY) {
        Cell[][] cells = new Cell[SIZE][SIZE];

        initCellsArray(cells);
        
        setRandomMines(cells, N_MINES);
        
        setAdiacentNumbers(cells, STRATEGY);

        return new GridImpl(cells);
    }


    private void initCellsArray(Cell[][] cells){
        for(int x = 0; x < cells.length; x++){
            for(int y = 0; y < cells[0].length; y++){
                cells[x][y] = new CellImpl();
            }
        }
    }

    private void setRandomMines(Cell[][] cells, final int N_MINES){
        final RandomPairGenerator RANDOM = new RandomPairGenerator(cells.length);
        for(int counter = 0; counter < N_MINES; counter++){
            Pair<Integer, Integer> pair;
            Cell cell;
            do{
                pair = RANDOM.nextPair();
                cell = cells[pair.getX()][pair.getY()];
            }while(cell.getType().equals(CellType.MINE));
            cells[pair.getX()][pair.getY()].setType(CellType.MINE);
        }
    }

    private void setAdiacentNumbers(Cell[][] cells, final NumberStrategy STRATEGY){
        for(int x = 0; x < cells.length; x++){
            for(int y = 0; y < cells[0].length; y++){
                if(!cells[x][y].getType().equals(CellType.MINE)){
                    final int cellNumber = STRATEGY.calculateNumber(cells, x, y);
                    if(cellNumber != 0){
                        cells[x][y].setType(CellType.NUMBER);
                        cells[x][y].setAdiacentMines(cellNumber);
                    }
                }
            }
        }
    }
}