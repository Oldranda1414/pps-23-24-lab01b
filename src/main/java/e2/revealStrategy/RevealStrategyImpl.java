package e2.revealStrategy;

import e2.cell.Cell;

public class RevealStrategyImpl implements RevealStrategy{

    @Override
    public void revealCell(Cell[][] cells, int X, int Y) {
        var cell = cells[X][Y];
        if(!cell.isVisible()){
            cell.setVisible(true);
            if(!cell.getNumber().isPresent()){
                recurrentRevealCell(cells, X, Y);
            }
        }
    }
    
    private void recurrentRevealCell(Cell[][] cells, int X, int Y){
        final int[] ADIACENT_X = {X, X - 1, X + 1};
        final int[] ADIACENT_Y = {Y, Y - 1, Y + 1};

        for(var x : ADIACENT_X){
            for(var y : ADIACENT_Y){
                if((x != X || y != Y) && isValidPosition(x, y, cells.length, cells[0].length)){
                    revealCell(cells, x, y);
                }
            }
        }
    }

    private boolean isValidPosition(final int X, final int Y, int SIZE_X, int SIZE_Y){

        if(X < SIZE_X && X >= 0 && Y < SIZE_Y && Y >= 0){
            return true;
        }
        return false;
    }
}
