package e2.grid;

import java.util.Optional;

public interface Grid {
    
    public Optional<Integer> getNumberOnCell(final int X, final int Y);

    public boolean hitCell(final int X, final int Y);

    public boolean hasMine(final int X, final int Y);
}
