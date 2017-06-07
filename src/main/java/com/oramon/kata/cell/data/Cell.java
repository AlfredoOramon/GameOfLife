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
    private CELL_STATE cell_state;

    public Cell(int id,CELL_STATE cell_state) {
        this.id=id;
        this.cell_state = cell_state;
    }

    public CELL_STATE getCell_state() {
        return cell_state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (id != cell.id) return false;
        return cell_state == cell.cell_state;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + cell_state.hashCode();
        return result;
    }

    public int getId() {
        return id;
    }
}
