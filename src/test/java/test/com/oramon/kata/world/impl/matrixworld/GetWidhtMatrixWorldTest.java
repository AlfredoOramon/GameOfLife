package test.com.oramon.kata.world.impl.matrixworld;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Assert;
import org.junit.Test;
import test.com.oramon.kata.world.impl.matrixworld.base.MatrixWorldBaseTest;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 14:31
 */
public class GetWidhtMatrixWorldTest extends MatrixWorldBaseTest {

    private int WIDTH_FOUR=4;
    private static final int WIDTH_THREE = 3;

    @Test
    public void getWidth_ForAWorldOfFourByThree_ShouldReturnThree() {
        Cell[][] cellWorld = getWorldOfThreeByThree();
        MatrixWorld world = new MatrixWorld(cellWorld);

        int result = world.getWidthWorld();

        Assert.assertEquals("MatrixWorld should have height:" + WIDTH_THREE, WIDTH_THREE, result);
    }

    @Test
    public void getWidth_ForAWorldOfFourByThree_ShouldReturnFour() {
        Cell[][] cellWorld = getWorldOfFourByFour();
        MatrixWorld world = new MatrixWorld(cellWorld);

        int result = world.getWidthWorld();

        Assert.assertEquals("MatrixWorld should have height:" + WIDTH_FOUR, WIDTH_FOUR, result);
    }
}
