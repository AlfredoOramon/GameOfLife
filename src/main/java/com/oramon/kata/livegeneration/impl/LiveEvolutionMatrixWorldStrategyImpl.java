package com.oramon.kata.livegeneration.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.World;

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
    public MatrixWorld createNextGenerationWorld(MatrixWorld world)
    {
//
        Cell[][] newArrayCell = new Cell[][]{
                new Cell[]{new Cell(1, ALIVE), new Cell(2, DEATH), new Cell(3, DEATH)},
                new Cell[]{new Cell(4, DEATH), new Cell(5, DEATH), new Cell(6, DEATH)},
                new Cell[]{new Cell(7, DEATH), new Cell(8, DEATH), new Cell(9, DEATH)}};

        MatrixWorld newMatrixWorld = new MatrixWorld(newArrayCell);

        MatrixWorld matrixWorld = new MatrixWorld(null);
        return matrixWorld;
    }

//    private int nextGenerationCell(int[][] world, int heightWorld, int widthWorld, int heightCell, int widthCell) {
//        List<Integer> neighbours=getNeightbours(world, heightWorld, widthWorld, heightCell, widthCell);
//
//        int aliveCells= colllectCellsByType(neighbours,CELL_ALIVE);
//        int deathCells= colllectCellsByType(neighbours,CELL_DEATH);
//
//        return 0;
//    }
//
//    private int colllectCellsByType(List<Integer> neighbours, int stateCell) {
//        return neighbours.stream().filter(cell-> cell==stateCell).collect(Collectors.toList()).size();
//    }
}
