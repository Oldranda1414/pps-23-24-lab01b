package e2.cell;

import java.util.Optional;

public class CellImpl implements Cell{

    private boolean flag = false;
    private Optional<Integer> adiacentMines = Optional.ofNullable(null);
    private boolean visible = false;
    private boolean isMine = false;

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
        return this.adiacentMines;
	}

	@Override
	public void setAdiacentMines(int adiacentMines) {
        this.adiacentMines = Optional.of(adiacentMines);
	}

    @Override
    public boolean isVisible() {
        return this.visible;
    }

    @Override
    public void setVisible(boolean bool) {
        this.visible = bool;
    }

    @Override
    public boolean isMine() {
        return this.isMine;
    }

    @Override
    public void setIsMine(boolean bool) {
        this.isMine = bool;
    }

}
