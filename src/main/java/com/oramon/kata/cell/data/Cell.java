package com.oramon.kata.cell.data;

import com.oramon.kata.cell.enums.CELL_STATE;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 10:20
 */
public class Cell {
    public static final int HASH_INT = 31;
    private int id;
    private CELL_STATE cellState;

    public Cell(int pId, CELL_STATE pCellState) {
        setId(pId);
        setCellState(pCellState);
    }

    public final CELL_STATE getCellState() {
        return cellState;
    }

    @Override
    public final boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }

        if (this == o) {
            return true;
        }

        Cell cell = (Cell) o;

        if (getId() != cell.getId()) {
            return false;
        }

        return getCellState() == cell.getCellState();
    }

    @Override
    public final int hashCode() {
        int result = getId();
        result = HASH_INT * result + getCellState().hashCode();
        return result;
    }


    public final Cell cloneIt() {
        return new Cell(this.getId(), this.getCellState());
    }

    public final int getId() {
        return id;
    }

    public final void setId(int pId) {
        id = pId;
    }

    public final void setCellState(CELL_STATE pCellState) {
        cellState = pCellState;
    }
}
