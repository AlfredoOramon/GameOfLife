package test.com.oramon.kata.livegeneration.interfaces;

import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStrategyImpl;

import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.World;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:31
 */
public class LiveEvolutionMatrixWorldStrategyTest {

   /* @Test
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldDie() {
        int[][] matrix = new int[][]
                {
                        new int[]{1, 0, 0, 0},
                        new int[]{1, 0, 1, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{1, 0, 1, 1},
                };
        World matrixWorld= new MatrixWorld(matrix);

        int[] [] result= new LiveEvolutionMatrixWorldStrategyImpl().createNextGenerationWorld(matrixWorld);
        int[][] expected = new int[][]
                {
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                };
        assertEquals("The next generation world should be", expected, result);
    }

    @Test
    public void nextGeneration_ACellWithFewerMoreThanTwoLiveNeighbours_ShouldLive() {
        int[][] matrix = new int[][]
                {
                        new int[]{1, 1, 0, 0},
                        new int[]{1, 0, 1, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{1, 0, 1, 1},
                };

        World matrixWorld= new MatrixWorld(matrix);

        int[] [] result= new LiveEvolutionMatrixWorldStrategyImpl().createNextGenerationWorld(matrixWorld);
        int[][] expected = new int[][]
                {
                        new int[]{1, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                        new int[]{0, 0, 0, 0},
                };
        assertEquals("The next generation world should be", expected, result);
    }*/

}