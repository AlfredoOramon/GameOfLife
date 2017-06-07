package com.oramon.kata;

import com.oramon.kata.draw.DrawStrategy;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.utils.GameOfLifeUtils;

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
    LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy;

    public GameOfLife(int[][] world,DrawStrategy strategy,LiveEvolutionMatrixWorldStrategy worldCycleOfLifeStrategy) {
        this.world=world;
        this.drawWorldStrategy=new DrawWorldStrategy(strategy);
        this.worldCycleOfLifeStrategy=worldCycleOfLifeStrategy;
    }

    public int[][] getWorld() {
        return GameOfLifeUtils.clone(world);
    }

    public String printWorld() {
        return printWorld(world);
    }

    public String nextGenerationWorld() {
        nextGenerationWorld(world);
        return printWorld(world);
    }

    private String printWorld(int [][] world) {
        return drawWorldStrategy.printworld(world);
    }

    private void nextGenerationWorld(int[][] world) {
        //this.world = worldCycleOfLifeStrategy.createNextGenerationWorld(world);
    }
}
