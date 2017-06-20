package com.oramon.kata.livegeneration.interfaces;

import com.oramon.kata.world.impl.MatrixWorld;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 29/05/17 9:33
 */
public interface LiveEvolutionMatrixWorldStrategy
{
    MatrixWorld createNextGenerationWorld(MatrixWorld world);
}
