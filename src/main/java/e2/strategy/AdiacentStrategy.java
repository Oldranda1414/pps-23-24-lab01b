package e2.strategy;

import e2.cell.Cell;
import e2.cell.CellType;

public class AdiacentStrategy implements NumberStrategy{


    @Override
    public int calculateNumber(Cell[][] cells, int X, int Y) {
        return countAdiacentMines(cells, X, Y, cells.length, cells[0].length);
    }

    private int countAdiacentMines(Cell[][] cells, int X, int Y, int SIZE_X, int SIZE_Y){
        int counter = 0;

        final int[] ADIACENT_X = {X, X - 1, X + 1};
        final int[] ADIACENT_Y = {Y, Y - 1, Y + 1};

        for(var x : ADIACENT_X){
            for(var y : ADIACENT_Y){
                if(x != X && y != Y && isValidPosition(x, y, SIZE_X, SIZE_Y)){
                    Cell currentCell = cells[x][y];
                    if(currentCell.getType().equals(CellType.MINE)) counter++;
                }
            }
        }
        return counter;
    }

    private boolean isValidPosition(final int X, final int Y, int SIZE_X, int SIZE_Y){

        if(X < SIZE_X && X >= 0 && Y < SIZE_Y && Y >= 0){
            return true;
        }
        return false;
    }
    
}
