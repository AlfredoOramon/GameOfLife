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

    public MatrixCoordinate(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
