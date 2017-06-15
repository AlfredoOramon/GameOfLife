package com.oramon.kata.livegeneration.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.data.MatrixCoordinate;
import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.Coordinate;
import com.oramon.kata.world.interfaces.World;

import java.util.List;

import static com.oramon.kata.cell.enums.CELL_STATE.ALIVE;
import static com.oramon.kata.cell.enums.CELL_STATE.DEATH;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:22
 */
public class LiveEvolutionMatrixWorldStrategyImpl implements LiveEvolutionMatrixWorldStrategy
{
    public MatrixWorld createNextGenerationWorld(MatrixWorld world) {
        Cell[][] cellMatrixWorld = world.getMatrixWorld();
        Cell[][] newMatrixArrayCell = world.getMatrixWorld();

        for (int rowCellMatrix = 0; rowCellMatrix < cellMatrixWorld.length; rowCellMatrix++) {
            for (int columnWorld = 0; columnWorld < cellMatrixWorld[rowCellMatrix].length; columnWorld++) {
                MatrixCoordinate coordinate = new MatrixCoordinate(columnWorld, rowCellMatrix);
                List<Cell> cellsNeighbours = world.getNeighboursOfACell(coordinate);
                newMatrixArrayCell[rowCellMatrix][columnWorld] = getNewCell(world.getCell(coordinate), cellsNeighbours);
            }
        }

        MatrixWorld newMatrixWorld = new MatrixWorld(newMatrixArrayCell);

        return newMatrixWorld;
    }

    private Cell getNewCell(Cell cell, List<Cell> cellsNeighbours) {
        CELL_STATE cell_state = CELL_STATE.DEATH;

        if (cell.getCellState().equals(ALIVE)) {
            cell_state = CELL_STATE.ALIVE;
            long number = cellsNeighbours
                    .stream()
                    .filter(cellInList -> cellInList.getCellState().equals(CELL_STATE.ALIVE))
                    .count();
            if (number < 2) {
                cell_state = CELL_STATE.DEATH;
            }
        } else if (cell.getCellState().equals(DEATH)) {
            cell_state = CELL_STATE.DEATH;
        }
        return new Cell(cell.getId(), cell_state);
    }
}
