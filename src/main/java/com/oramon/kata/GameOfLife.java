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
    DrawWorldStrategy drawWorldStrategy;

    public GameOfLife(int[][] world,DrawStrategy strategy) {
        this.world=world;
        this.drawWorldStrategy=new DrawWorldStrategy(strategy);
    }

    public int[][] getWorld() {
        return world;
    }

    public String printWorld() {
        return drawWorldStrategy.printworld(world);
    }

    public String nextGenerationWorld()
    {
        return null;
    }
}
