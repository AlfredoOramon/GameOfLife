package com.oramon.kata.world.impl;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.util.CellUtils;
import com.oramon.kata.world.data.MatrixCoordinate;
import com.oramon.kata.world.interfaces.World;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 1/06/17 9:19
 */
public class MatrixWorld implements World
{
    private Cell[][] matrixWorld;
    private int widthWorld=0;
    private int heightWorld=0;


    public MatrixWorld(Cell[][] world) {
        Cell[][] creationWorld=CellUtils.clone(world);
        matrixWorld = creationWorld;
        heightWorld = creationWorld.length;
        if (creationWorld.length > 1) {
            widthWorld = creationWorld[0].length;
        }
    }

    public final List<Cell> getNeighboursOfACell(MatrixCoordinate cellCoordinate) {

        int widthToStart = getWidthToStart(cellCoordinate);
        int widthToFinish = getWidthToFinish(cellCoordinate);

        int heightToStart = getHeightToStart(cellCoordinate);
        int heightToFinish = getHeightToFinish(cellCoordinate);

        ArrayList<Cell> neighbourCells = new ArrayList<Cell>();

        for (int loopHeight = heightToStart; loopHeight <= heightToFinish; loopHeight++) {

            for (int loopWidth = widthToStart; loopWidth <= widthToFinish; loopWidth++) {

                if (isNotTheCellItSelf(cellCoordinate, loopWidth, loopHeight)) {
                    neighbourCells.add(matrixWorld[loopHeight][loopWidth]);
                }
            }
        }
        return neighbourCells;
    }

    public final Cell[][] getMatrixWorld()
    {
        return CellUtils.clone(matrixWorld);
    }

    public final int getWidthWorld() {
        return widthWorld;
    }

    public final int getHeightWorld() {
        return heightWorld;
    }

    public final Cell getCell(MatrixCoordinate matrixCoordinate) {
        return matrixWorld[matrixCoordinate.getHeight()][matrixCoordinate.getWidth()];
    }

    private int getHeightToFinish(MatrixCoordinate cellCoordinate) {
        int heightToFinish = cellCoordinate.getHeight() + 1;
        if (heightToFinish > getMaxHeightMatrix()) {
            heightToFinish = getMaxHeightMatrix();
        }
        return heightToFinish;
    }

    private int getHeightToStart(MatrixCoordinate cellCoordinate) {
        int heightToStart = cellCoordinate.getHeight() - 1;
        if (heightToStart < 0) {
            heightToStart = 0;
        }
        return heightToStart;
    }

    private int getWidthToFinish(MatrixCoordinate cellCoordinate) {
        int widthToFinish = cellCoordinate.getWidth() + 1;
        if (widthToFinish > getMaxWidthMatrix()) {
            widthToFinish = getMaxWidthMatrix();
        }
        return widthToFinish;
    }

    private int getWidthToStart(MatrixCoordinate cellCoordinate) {
        int widthToStart = cellCoordinate.getWidth() - 1;
        if (widthToStart < 0) {
            widthToStart = 0;
        }
        return widthToStart;
    }

    private int getMaxHeightMatrix() {
        return getHeightWorld()-1;
    }

    private int  getMaxWidthMatrix() {
        return getWidthWorld()-1;
    }

    private boolean isNotTheCellItSelf(MatrixCoordinate cellCoordinate, int width, int height) {
        return !(width == cellCoordinate.getWidth() && height == cellCoordinate.getHeight());
    }

/*    private void setMatrixWorld(Cell[][] matrixWorldArray) {
        matrixWorld = matrixWorldArray;
    }
    private void setHeightWorld(int heightOfTheWorld) {
        heightWorld = heightOfTheWorld;
    }
    private void setWidthWorld(int widthOfTheWorld) {
        this.widthWorld = widthOfTheWorld;
    }*/
}
