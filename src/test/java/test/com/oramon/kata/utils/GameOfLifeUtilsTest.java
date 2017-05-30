package test.com.oramon.kata.utils;

import com.oramon.kata.utils.GameOfLifeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.com.oramon.kata.GameOfLifeTest;

import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 10:13
 */
public class GameOfLifeUtilsTest {

    @Test
    public void cloneMatrix_WithAWorld_ShouldRetrunACloneWorld()
    {
        int[][] world = new int[][]
                {
                        new int[]{0,1,1,1},
                        new int[]{1,2,1,1},
                        new int[]{1,1,2,1},
                        new int[]{0,1,0,1},
                };

        int[][] result=GameOfLifeUtils.clone(world);

        int[][] expected = new int[][]
                {
                        new int[]{0,1,1,1},
                        new int[]{1,1,1,1},
                        new int[]{1,1,1,1},
                        new int[]{0,1,0,1},
                };

        Assert.assertEquals("Should return same world",expected,result);
    }
}