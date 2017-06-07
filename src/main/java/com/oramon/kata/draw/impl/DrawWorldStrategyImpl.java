package com.oramon.kata.draw.impl;

import com.oramon.kata.draw.DrawStrategy;
import com.oramon.kata.draw.DrawWorldStrategy;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 15:01
 */
public class DrawWorldStrategyImpl implements DrawWorldStrategy {

    DrawStrategy drawStrategy;

    public DrawWorldStrategyImpl(DrawStrategy strategy) {
        this.drawStrategy=strategy;
    }

    public String printWorld(int[][] world) {
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
