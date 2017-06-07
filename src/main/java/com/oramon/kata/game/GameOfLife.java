package com.oramon.kata.game;

import com.oramon.kata.draw.impl.DrawWorldStrategyImpl;
import com.oramon.kata.draw.DrawStrategy;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 11:57
 */
public class GameOfLife {
    private int[][] world;
    DrawWorldStrategyImpl drawWorldStrategy;
    LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy;

    public GameOfLife(int[][] world,DrawStrategy strategy,LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy) {
        this.world=world;
        this.drawWorldStrategy=new DrawWorldStrategyImpl(strategy);
        this.worldCycleOfLifeStrategy=worldCycleOfLifeStrategy;
    }

    public String printWorld() {
        return printWorld(world);
    }

    public String nextGenerationWorld() {
        nextGenerationWorld(world);
        return printWorld(world);
    }

    private String printWorld(int [][] world) {
        return drawWorldStrategy.printWorld(world);
    }

    private void nextGenerationWorld(int[][] world) {
        //this.world = worldCycleOfLifeStrategy.createNextGenerationWorld(world);
    }
}
