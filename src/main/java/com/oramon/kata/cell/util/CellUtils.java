package com.oramon.kata.cell.util;

import com.oramon.kata.cell.data.Cell;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 10:13
 */
public final class CellUtils {
    private CellUtils() {
    }

    public static Cell[][] clone(Cell[][] matrix) {

        Cell[][] myNewCellArray = new Cell[matrix.length][];

        for (int height = 0; height < matrix.length; height++) {
            myNewCellArray[height] = cloneRow(matrix[height]);
        }
        return myNewCellArray;
    }

    private static Cell[] cloneRow(Cell[] cells) {
        Cell[] newCells = new Cell[cells.length];

        for (int width = 0; width < cells.length; width++) {
            Cell newCell = cells[width].clone();
            newCells[width] = newCell;
        }
        return newCells;
    }
}
