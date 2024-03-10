package e2.numberStrategy;

import e2.cell.Cell;

public class NumberStrategyImpl implements NumberStrategy{


    @Override
    public int calculateNumber(Cell[][] cells, int X, int Y) {
        return countAdiacentMines(cells, X, Y);
    }

    private int countAdiacentMines(Cell[][] cells, int X, int Y){
        int counter = 0;

        final int[] ADIACENT_X = {X, X - 1, X + 1};
        final int[] ADIACENT_Y = {Y, Y - 1, Y + 1};

        for(var x : ADIACENT_X){
            for(var y : ADIACENT_Y){
                if((x != X || y != Y) && isValidPosition(x, y, cells.length, cells[0].length)){
                    Cell currentCell = cells[x][y];
                    if(currentCell.isMine()) counter++;
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
