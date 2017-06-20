package test.com.oramon.kata.world.impl.matrixworld;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.world.data.MatrixCoordinate;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Before;
import org.junit.Test;
import test.com.oramon.kata.world.impl.matrixworld.base.MatrixWorldBaseTest;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 14:33
 */
public class GetCellMatrixWorldTest extends MatrixWorldBaseTest {

    private MatrixWorld world;

    @Before
    public void setup() {

        Cell[][] cellArray = new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};

        world = new MatrixWorld(cellArray);
    }

    @Test
    public void shouldReturnFirstCell()
    {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ZERO, HEIGHT_ZERO));
        assertThat("Should return the first cell of the world",firstCell,is(result));
    }

    @Test
    public void shouldReturnSecondCell()
    {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ONE, HEIGHT_ZERO));
        assertThat("Should return the second cell of the world",secondCell,is(result));
    }

    @Test
    public void shouldReturnThirdCell()
    {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_TWO, HEIGHT_ZERO));
        assertThat("Should return the third cell of the world",thirdCell,is(result));
    }

    @Test
    public void shouldReturnFourthCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ZERO, HEIGHT_ONE));
        assertThat("Should return the fourth cell of the world", fourthCell, is(result));
    }

    @Test
    public void shouldReturnFifthCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ONE, HEIGHT_ONE));
        assertThat("Should return the fourth cell of the world", fifthCell, is(result));
    }

    @Test
    public void shouldReturnSixthCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_TWO, HEIGHT_ONE));
        assertThat("Should return the sixth cell of the world", sixthCell, is(result));
    }

    @Test
    public void shouldReturnSeventhCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ZERO, HEIGHT_TWO));
        assertThat("Should return the seventh cell of the world", seventh, is(result));
    }

    @Test
    public void shouldReturnEightCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_ONE, HEIGHT_TWO));
        assertThat("Should return the eight cell of the world", eightCell, is(result));
    }

    @Test
    public void shouldReturnNinthCell() {
        Cell result = world.getCell(new MatrixCoordinate(WIDTH_TWO, HEIGHT_TWO));
        assertThat("Should return the night cell of the world", ninthCell, is(result));
    }

}
