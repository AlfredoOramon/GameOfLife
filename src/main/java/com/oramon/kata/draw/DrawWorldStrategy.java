package com.oramon.kata.draw;

import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.World;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 7/06/17 10:59
 */
public interface DrawWorldStrategy {

    public String printWorld(MatrixWorld world);
}
