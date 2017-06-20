package com.oramon.kata.draw.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.DrawCellStrategy;

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

    public DrawCellStrategyImpl(String valueOfTheCellAlive, String valueOfTheCellDeath)
    {
        valueAlive=valueOfTheCellAlive;
        valueDeath=valueOfTheCellDeath;
    }

    public final String getSymbolToDraw(Cell value) {
        String result;
        if (value.getCellState() == CELL_STATE.ALIVE) {
            result = valueAlive;
        } else if (value.getCellState() == CELL_STATE.DEATH) {
            result = valueDeath;
        } else {
            throw new IllegalStateException();
        }
        return result;
    }
}
