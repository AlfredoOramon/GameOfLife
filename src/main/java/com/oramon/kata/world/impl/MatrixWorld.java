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
    private Cell[][] world;
    private int widthWorld=0;
    private int heightWorld=0;


    public MatrixWorld(Cell[][] world) {
        this.setWorld(world);
        this.setHeightWorld(world.length);
        if (world.length > 1)
            this.setWidthWorld(world[0].length);
    }

    public List<Cell> getNeighboursOfACell(MatrixCoordinate cellCoordinate) {

        int widthToStart = getWidthToStart(cellCoordinate);
        int widthToFinish = getWidthToFinish(cellCoordinate);

        int heightToStart = getHeightToStart(cellCoordinate);
        int heightToFinish = getHeightToFinish(cellCoordinate);

        ArrayList<Cell> neighbourCells = new ArrayList<Cell>();

        for (int loopHeight = heightToStart; loopHeight <= heightToFinish; loopHeight++) {

            for (int loopWidth = widthToStart; loopWidth <= widthToFinish; loopWidth++) {

                if (isNotTheCellItSelf(cellCoordinate, loopWidth, loopHeight)) {
                    neighbourCells.add(world[loopHeight][loopWidth]);
                }
            }
        }
        return neighbourCells;
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

    public MatrixWorld getMatrixWorld() {

        Cell[][] newArrayCell= CellUtils.clone(world);
        return new MatrixWorld(newArrayCell);
    }

    public int getWidthWorld() {
        return widthWorld;
    }

    public int getHeightWorld() {
        return heightWorld;
    }

    public Cell getCell(MatrixCoordinate matrixCoordinate) {
        return world[matrixCoordinate.getHeight()][matrixCoordinate.getWidth()];
    }

    private void setWorld(Cell[][] world) {
        this.world = world;
    }
    private void setHeightWorld(int heightWorld) {
        this.heightWorld = heightWorld;
    }
    private void setWidthWorld(int widthWorld) {
        this.widthWorld = widthWorld;
    }
}
