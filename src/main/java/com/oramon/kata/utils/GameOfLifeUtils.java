package com.oramon.kata.utils;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 10:13
 */
public class GameOfLifeUtils
{
    public static int[][] clone(int[][] matrix) {
        int[][] myInt = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++)
            myInt[i] = matrix[i].clone();
        return myInt;
    }
}
