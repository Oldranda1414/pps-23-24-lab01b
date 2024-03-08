package e2.grid;

//TODO CHECK IF CONSTRUCTOR IS EVER USED
public class CellImpl implements Cell{

    private CellType type = CellType.EMPTY;
    private boolean flag = false;

    @Override
    public CellType getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    @Override
    public void setType(CellType type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setType'");
    }

    @Override
    public boolean isFlagged() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFlagged'");
    }

    @Override
    public void setFlag(boolean bool) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFlag'");
    }

}
