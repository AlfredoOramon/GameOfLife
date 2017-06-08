package com.oramon.kata.draw.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.DrawCellStrategy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 12:32
 */
public class DrawCellStrategyImpl implements DrawCellStrategy {

    private final String valueAlive;
    private final String valueDeath;

    public DrawCellStrategyImpl(String valueAlive, String valueDeath)
    {
        this.valueAlive=valueAlive;
        this.valueDeath=valueDeath;
    }

    public String getSymbolToDraw(Cell value) {
        String result;
        if (value.getCellState() == CELL_STATE.ALIVE) {
            result = valueAlive;
        } else if (value.getCellState() == CELL_STATE.DEATH) {
            result = valueDeath;
        } else {
            throw new NotImplementedException();
        }
        return result;
    }
}
