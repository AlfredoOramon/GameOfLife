package com.oramon.kata.game;

import com.oramon.kata.draw.impl.DrawMatrixWorldStrategyImpl;
import com.oramon.kata.draw.DrawCellStrategy;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 11:57
 */
public class GameOfLife {
    private MatrixWorld world;
    DrawMatrixWorldStrategyImpl drawWorldStrategy;
    LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy;

    public GameOfLife(MatrixWorld world, DrawCellStrategy strategy, LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy) {
        this.world=world;
        this.drawWorldStrategy=new DrawMatrixWorldStrategyImpl(strategy);
        this.worldCycleOfLifeStrategy=worldCycleOfLifeStrategy;
    }

    public String printWorld() {
        return printWorld(world);
    }

    public String nextGenerationWorld() {
        nextGenerationWorld(world);
        return printWorld(world);
    }

    private String printWorld(MatrixWorld world) {
        return drawWorldStrategy.printWorld(world);
    }

    private void nextGenerationWorld(MatrixWorld world) {
        //this.world = worldCycleOfLifeStrategy.createNextGenerationWorld(world);
    }
}
