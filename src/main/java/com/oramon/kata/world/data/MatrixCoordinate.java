package com.oramon.kata.world.data;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 2/06/17 11:18
 */
public class MatrixCoordinate {
    private int width;
    private int height;

    public MatrixCoordinate(int widthCoordinate, int heightCoordinate) {
        width = widthCoordinate;
        height = heightCoordinate;
    }

    public final int getHeight() {
        return height;
    }

    public final int getWidth() {
        return width;
    }
}
