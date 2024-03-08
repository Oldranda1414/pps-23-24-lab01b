package e2.grid;

import java.util.ArrayList;

import e2.utils.Pair;

public class GridImpl implements Grid{

    private int size;

    public GridImpl(int size){
        this.size = size;
    }

    @Override
    public Cell getCell(Pair<Integer, Integer> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCell'");
    }

    @Override
    public ArrayList<Cell> getAdiacentCells(Pair<Integer, Integer> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdiacentCells'");
    }
    
}
