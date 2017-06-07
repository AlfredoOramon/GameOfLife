package test.com.oramon.kata.world.impl.matrixworld;

import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 2/06/17 11:30
 */
public class MatrixWorldTest {

    private static final int HEIGHT_ONE = 1;
    private static final int WIDTH_ONE = 1;

    private static final int WIDTH_ZERO = 0;
    private static final int HEIGHT_ZERO = 0;

    private MatrixWorld world;

    @Before
    public void setUp() {}

    @Test
    public void getNeighbours_ForFirstCell_ShouldReturnTwoFiveFourCells() {

     /*   Cell[][] cellWorld = getWorldOfThreeByThree();
        world = new MatrixWorld(cellWorld);

        List<Cell> neighboursOfACell = world.getNeighboursOfACell(new MatrixCoordinate(WIDTH_ZERO, HEIGHT_ZERO));

        assertThat("The neighbours should be:", neighboursOfACell, containsInAnyOrder(world[0][1]);*/
    }
}