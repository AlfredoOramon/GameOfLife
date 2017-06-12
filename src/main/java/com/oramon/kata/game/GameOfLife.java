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

    public GameOfLife(MatrixWorld world, DrawWorldStrategy drawWorldStrategy, LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy) {
        this.world=world;
        this.drawWorldStrategy=drawWorldStrategy;
        this.worldCycleOfLifeStrategy=worldCycleOfLifeStrategy;
    }

    public String printWorld() {
        return printWorld(world);
    }

    public String nextGenerationWorld() {
        world = worldCycleOfLifeStrategy.createNextGenerationWorld(world);
        return printWorld(world);
    }

    private String printWorld(MatrixWorld world) {
        return drawWorldStrategy.printWorld(world);
    }
}
