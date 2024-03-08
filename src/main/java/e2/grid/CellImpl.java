package e2.grid;

//TODO CHECK IF CONSTRUCTOR IS EVER USED
public class CellImpl implements Cell{

    private CellType type = CellType.EMPTY;
    private boolean flag = false;

    @Override
    public CellType getType() {
        return this.type;
    }

    @Override
    public void setType(CellType type) {
        this.type = type;
    }

    @Override
    public boolean isFlagged() {
        return this.flag;
    }

    @Override
    public void setFlag(boolean bool) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFlag'");
    }

}
