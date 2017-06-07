package com.oramon.kata.cell;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 10:27
 */
public enum CELL_STATE {
    ALIVE(1), DEATH(0);

    private final int cellState;

    CELL_STATE(final int cellState) {
        this.cellState = cellState;
    }

    public int getCellState() {
        return cellState;
    }
}
