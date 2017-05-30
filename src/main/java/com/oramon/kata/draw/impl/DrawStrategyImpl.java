package com.oramon.kata.draw.impl;

import com.oramon.kata.constants.GameOfLifeConstants;
import com.oramon.kata.draw.DrawStrategy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 12:32
 */
public class DrawStrategyImpl implements DrawStrategy {

    private String valueAlive;
    private String valueDeath;

    public DrawStrategyImpl(String valueAlive,String valueDeath)
    {
        this.valueAlive=valueAlive;
        this.valueDeath=valueDeath;
    }

    public String getSymbolToDraw(int value) {
        String result;
        if (value == GameOfLifeConstants.CELL_ALIVE) {
            result = valueAlive;
        } else if (value == GameOfLifeConstants.CELL_DEATH) {
            result = valueDeath;
        } else {
            throw new NotImplementedException();
        }
        return result;
    }

    public String getValueAlive() {
        return valueAlive;
    }

    public void setValueAlive(String valueAlive) {
        this.valueAlive = valueAlive;
    }

    public String getValueDeath() {
        return valueDeath;
    }

    public void setValueDeath(String valueDeath) {
        this.valueDeath = valueDeath;
    }
}
