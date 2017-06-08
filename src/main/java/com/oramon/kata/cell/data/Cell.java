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
    private int id;
    private CELL_STATE cellState;

    public Cell(int id,CELL_STATE cellState) {
        this.id=id;
        this.cellState = cellState;
    }

    public CELL_STATE getCellState() {
        return cellState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cell cell = (Cell) o;

        if (id != cell.id) return false;
        {
            return cellState == cell.cellState;
        }
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cellState.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }
}
