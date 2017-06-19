package com.oramon.kata.game;

import com.oramon.kata.draw.DrawWorldStrategy;
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
    private DrawWorldStrategy drawWorldStrategy;
    private LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy;

    public GameOfLife(MatrixWorld matrixWorld, DrawWorldStrategy drawWorldStrategyImpl, LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategyImpl) {
        world = matrixWorld;
        drawWorldStrategy = drawWorldStrategyImpl;
        worldCycleOfLifeStrategy = worldCycleOfLifeStrategyImpl;
    }

    public final String printWorld() {
        return printWorld(world);
    }

    public final String nextGenerationWorld() {
        world = worldCycleOfLifeStrategy.createNextGenerationWorld(world);
        return printWorld(world);
    }

    private String printWorld(MatrixWorld matrixWorld) {
        return drawWorldStrategy.printWorld(matrixWorld);
    }
}
