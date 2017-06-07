package com.oramon.kata;

import com.oramon.kata.cell.CELL_STATE;

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

    public int getId() {
        return id;
    }
}
