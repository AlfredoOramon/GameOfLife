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
 * Date: 5/06/17 14:24
 */
public class GetHeightMatrixWorldTest extends MatrixWorldBaseTest {

    private int HEIGHT_FOUR=4;
    private static final int HEIGHT_THREE = 3;

    @Test
    public void getHeight_ForAWorldOFThreeByThree_ShouldReturnThree() {
        Cell[][] cellWorld = getWorldOfThreeByThree();
        MatrixWorld world = new MatrixWorld(cellWorld);

        int result = world.getHeightWorld();

        Assert.assertEquals("The height should be" + HEIGHT_THREE, HEIGHT_THREE, result);
    }

    @Test
    public void getHeight_ForAWorldOFFourByFour_ShouldReturnFour() {
        Cell[][] cellWorld = getWorldOfFourByFour();
        MatrixWorld world = new MatrixWorld(cellWorld);

        int result = world.getHeightWorld();

        Assert.assertEquals("The height should be" + HEIGHT_FOUR, HEIGHT_FOUR, result);
    }
}
