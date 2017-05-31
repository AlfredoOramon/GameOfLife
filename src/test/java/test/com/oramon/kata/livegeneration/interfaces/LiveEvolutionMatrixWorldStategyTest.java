package test.com.oramon.kata.livegeneration.interfaces;

import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStategyImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:31
 */
public class LiveEvolutionMatrixWorldStategyTest {

    @Test
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldDie() {
        int[][] world = new int[][]
                {
                        new int[]{1, 0, 0, 0},
                        new int[]{1, 0, 1, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{1, 0, 1, 1},
                };

        int[] [] result= new LiveEvolutionMatrixWorldStategyImpl().createNextGenerationWorld(world);
        int[][] expected = new int[][]
                {
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                };
        assertEquals("The next generation world should be", expected, result);
    }

}