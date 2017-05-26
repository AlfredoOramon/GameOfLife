package com.oramon.kata;

import com.oramon.kata.draw.DrawStrategy;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 15:01
 */
public class DrawWorldStrategy {

    DrawStrategy drawStrategy;

    public DrawWorldStrategy(DrawStrategy strategy) {
        this.drawStrategy=strategy;
    }

    public String printworld(int[][] world) {
        StringBuilder builder = new StringBuilder();
        for (int[] row : world) {
            for (int value : row) {
                builder.append(drawStrategy.getSymbolToDraw(value));
            }
            builder.append(System.getProperty("line.separator"));
        }
        return builder.toString();
    }
}
