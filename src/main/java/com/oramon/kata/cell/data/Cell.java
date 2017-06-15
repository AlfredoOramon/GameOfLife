package com.oramon.kata.cell.data;

import com.oramon.kata.cell.enums.CELL_STATE;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 10:20
 */
public class Cell implements Cloneable {
    private int id;
    private CELL_STATE cellState;

    public Cell(int id, CELL_STATE cellState) {
        this.setId(id);
        this.setCellState(cellState);
    }

    public CELL_STATE getCellState() {
        return cellState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        Cell cell = (Cell) o;

        if (getId() != cell.getId()) return false;
        {
            return getCellState() == cell.getCellState();
        }
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getCellState().hashCode();
        return result;
    }


    public Cell clone() {

        return new Cell(this.getId(), this.getCellState());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCellState(CELL_STATE cellState) {
        this.cellState = cellState;
    }
}
