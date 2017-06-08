package com.oramon.kata.draw.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.draw.DrawCellStrategy;
import com.oramon.kata.draw.DrawWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 15:01
 */
public class DrawMatrixWorldStrategyImpl implements DrawWorldStrategy
{
    private DrawCellStrategy drawCellStrategy;

    public DrawMatrixWorldStrategyImpl(DrawCellStrategy strategy) {
        this.drawCellStrategy = strategy;
    }

    public String printWorld(MatrixWorld matrixWorld) {

        Cell[][] arrayCells = matrixWorld.getMatrixWorld();

        StringBuilder builder = new StringBuilder();
        for (Cell[] cellList : arrayCells) {
            for (Cell cell : cellList) {
                builder.append(drawCellStrategy.getSymbolToDraw(cell));
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
