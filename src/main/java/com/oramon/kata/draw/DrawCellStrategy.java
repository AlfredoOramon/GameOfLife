package com.oramon.kata.draw;

import com.oramon.kata.cell.data.Cell;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 12:24
 */
public interface DrawCellStrategy {
    String getSymbolToDraw(int value);//TODO remove

    String getSymbolToDraw(Cell value);
}
