package com.oramon.kata.livegeneration.impl;

import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.World;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:22
 */
public class LiveEvolutionMatrixWorldStrategyImpl implements LiveEvolutionMatrixWorldStrategy
{
    public World createNextGenerationWorld(World world)
    {
//        int heightWorld = world.length;
//        int widthWorld = world.length;
//
//        int[][] newWorld = new int[heightWorld][widthWorld];
//
//        for (int heightCell = 0; heightCell < heightWorld; heightCell++) {
//            for (int widthCell = 0; widthCell < widthWorld; widthCell++) {
//                newWorld[heightCell][widthCell] = nextGenerationCell(world, heightWorld, widthWorld, heightCell, widthCell);
//            }
//        }
//        return newWorld;
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
