package test.com.oramon.kata.utils;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.cell.util.CellUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.com.oramon.kata.world.impl.matrixworld.base.MatrixWorldBaseTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 10:13
 */
public class GameOfLifeUtilsTest extends MatrixWorldBaseTest {

    private  Cell[][] cellArray;

    private Cell[][] createNewWorld()
    {
        Cell firstCell = new Cell(ID_ONE, CELL_STATE.ALIVE);
        Cell secondCell = new Cell(ID_TWO, CELL_STATE.DEATH);
        Cell thirdCell = new Cell(ID_THREE, CELL_STATE.DEATH);
        Cell fourthCell = new Cell(ID_FOUR, CELL_STATE.ALIVE);
        Cell fifthCell = new Cell(ID_FIVE, CELL_STATE.ALIVE);
        Cell sixthCell = new Cell(ID_SIX, CELL_STATE.ALIVE);
        Cell seventh = new Cell(ID_SEVEN, CELL_STATE.ALIVE);
        Cell eightCell = new Cell(ID_EIGHT, CELL_STATE.ALIVE);
        Cell ninthCell = new Cell(ID_NINE, CELL_STATE.ALIVE);

        Cell[][] cellArrayResult = new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};

        return cellArrayResult;
    }
    @Before
    public void setup() {
        cellArray =createNewWorld();
    }

    @Test
    public void cloneMatrix_WithAWorld_ShouldReturnACloneWorld()
    {
        Cell[][] result = CellUtils.clone(cellArray);

        Cell[][] expected = createNewWorld();

        Assert.assertEquals("Should return same world",expected,result);
    }

    //TestCoverage
    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = CellUtils.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}