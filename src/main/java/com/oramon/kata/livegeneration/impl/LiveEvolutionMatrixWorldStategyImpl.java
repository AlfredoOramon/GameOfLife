package com.oramon.kata.livegeneration.impl;

import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:22
 */
public class LiveEvolutionMatrixWorldStategyImpl implements LiveEvolutionMatrixWorldStrategy {

    public int[][] createNextGenerationWorld(int[][] world) {
        int[][] result = new int[][]
                {
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                };
        return result;
    }
}
