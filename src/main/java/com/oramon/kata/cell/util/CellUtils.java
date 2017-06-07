package com.oramon.kata.cell.util;

import com.oramon.kata.cell.data.Cell;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 10:13
 */
public class CellUtils
{
    public static Cell[][] clone(Cell[][] matrix) {
        Cell[][] myCellArray = new Cell[matrix.length][];
        for (int i = 0; i < matrix.length; i++)
            myCellArray[i] = matrix[i].clone();
        return myCellArray;
    }
}
