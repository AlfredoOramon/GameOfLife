package test.com.oramon.kata.cell.data;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 14/06/17 10:00
 */
@RunWith(JUnitParamsRunner.class)
public class CellTest {

    private static final int ID_ONE = 1;

    private static final Object[] getIds() {

        return new Object[]{
                new Object[]{10},
                new Object[]{20}
        };
    }

    @Test
    @Parameters(method = "getIds")
    public void getId_ShouldReturnTheProperID(int id) {

        Cell SUT = new Cell(id, CELL_STATE.ALIVE);
        int result = SUT.getId();

        int expected = id;
        Assert.assertEquals("The Id should be:" + id, expected, result);
    }

    private static final Object[] getCellStatus() {

        return new Object[]{
                new Object[]{CELL_STATE.ALIVE},
                new Object[]{CELL_STATE.DEATH}
        };
    }

    @Test
    @Parameters(method = "getCellStatus")
    public void getCellStatus_ShouldReturnTheProperCellStatus(CELL_STATE cell_state) {

        Cell SUT = new Cell(ID_ONE, cell_state);
        CELL_STATE result = SUT.getCellState();

        CELL_STATE expected = cell_state;
        Assert.assertEquals("The Id should be:" + cell_state, expected, result);
    }

    private static final Object[] getIdsPlusCellState() {
        return new Object[]{
                new Object[]{10, CELL_STATE.ALIVE},
                new Object[]{20, CELL_STATE.ALIVE}
        };
    }

    @Test
    @Parameters(method = "getIdsPlusCellState")
    public void testEquals_Symmetric(int idCell, CELL_STATE cell_state) {
        Cell x = new Cell(idCell, cell_state);  // equals and hashCode check name field value
        Cell y = new Cell(idCell, cell_state);
        Assert.assertTrue(x.equals(y) && y.equals(x));
        Assert.assertTrue(x.hashCode() == y.hashCode());
    }

    @Test
    @Parameters(method = "getIdsPlusCellState")
    public void cloneShouldReturnANewObject(int idCell, CELL_STATE cell_state) {
        Cell oldCell = new Cell(idCell, cell_state);  // equals and hashCode check name field value
        Cell clonedCell = oldCell.clone();

        oldCell.setId(ID_ONE);
        oldCell.setCellState(CELL_STATE.DEATH);

        Assert.assertNotEquals("The id of the cells should de different", oldCell.getId(), clonedCell.getId());
        System.out.print("old: " + oldCell.getId());
        System.out.print("cloned: " + clonedCell.getId());
        Assert.assertNotEquals("The id of the cells should de different", oldCell.getCellState(), clonedCell.getCellState());
    }
}