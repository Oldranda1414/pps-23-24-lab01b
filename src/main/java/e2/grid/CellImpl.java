package e2.grid;

import java.util.Optional;

public class CellImpl implements Cell{

    private CellType type = CellType.EMPTY;
    private boolean flag = false;
    private Optional<Integer> adiacentMines = Optional.ofNullable(null);

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
        this.flag = bool;
    }

	@Override
	public Optional<Integer> getAdiacentMines() {
        if(this.adiacentMines.isPresent()){
            return Optional.of(this.adiacentMines.get());
        }
        else{
            return Optional.ofNullable(null);
        }
	}

	@Override
	public void setAdiacentMines(int adiacentMines) {
        this.adiacentMines = Optional.of(adiacentMines);
	}

}
