package com.oramon.kata;

import com.oramon.kata.draw.DrawStrategy;
import com.oramon.kata.draw.impl.DrawStrategyImpl;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 11:57
 */
public class GameOfLife {
    private int[][] world;
    DrawStrategy drawStrategy;

    public GameOfLife(int[][] world,DrawStrategy strategy) {
        this.world=world;
        this.drawStrategy=strategy;
    }

    public int[][] getWorld() {
        return world;
    }

    public String printWorld() {
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
