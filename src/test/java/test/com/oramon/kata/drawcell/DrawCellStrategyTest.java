package test.com.oramon.kata.drawcell;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.DrawCellStrategy;
import com.oramon.kata.draw.impl.DrawCellStrategyImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.testEnums.EnumBuster;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 15:06
 */
@RunWith(JUnitParamsRunner.class)
public class DrawCellStrategyTest {

    public static final String VALUE_ALIVE_ONE = "1";
    public static final String VALUE_DEATH_ZERO = "0";
    private static final String VALUE_DEATH_HYPHEN = "-";
    private static final String VALUE_ALIVE_STAR = "*";

    private static final int ID_ONE = 1;
    private static final int ID_TWO = 2;

    public static final Cell liveCell= new Cell(ID_ONE, CELL_STATE.ALIVE);
    public static final Cell deathCell= new Cell(ID_TWO, CELL_STATE.ALIVE);

    private static final int ZERO_NUMBER = 0;

    private DrawCellStrategy SUT;

    @Before
    public void setup()
    {
    }



    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getAlivePosibilities() {

        return new Object[] {
                new Object[] {VALUE_ALIVE_ONE},
                new Object[] {VALUE_ALIVE_STAR}
        };
    }

    @Test
    @Parameters(method = "getAlivePosibilities")
    public void getSymbolToDraw_WithAliveOneParam_ShouldPrintSimbol(String symbolToDraw) {
        SUT = new DrawCellStrategyImpl(symbolToDraw, VALUE_DEATH_ZERO);
        String result=SUT.getSymbolToDraw(liveCell);

        Assert.assertEquals("Should return"+symbolToDraw,symbolToDraw,result);
    }

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getDeathPosibilities() {

        return new Object[] {
                new Object[] {VALUE_DEATH_ZERO},
                new Object[] {VALUE_DEATH_HYPHEN}
        };
    }

    @Test
    @Parameters(method = "getDeathPosibilities")
    public void getSymbolToDraw_WithDeathParamInConstructor_ShouldPrintSimbol(String symbolToDraw) {

        SUT = new DrawCellStrategyImpl(symbolToDraw, VALUE_DEATH_ZERO);
        String result=SUT.getSymbolToDraw(deathCell);

        Assert.assertEquals("Should return"+symbolToDraw,symbolToDraw,result);
    }

    @Test(expected = IllegalStateException.class)
    public void test()
    {
        EnumBuster<CELL_STATE> buster= new EnumBuster<CELL_STATE>(CELL_STATE.class);

        CELL_STATE NOT_EXISTING = buster.make("NOT_EXISTING");

        Cell cell=new Cell(ID_ONE,NOT_EXISTING);

        SUT = new DrawCellStrategyImpl(VALUE_DEATH_ZERO, VALUE_DEATH_ZERO);
        String result=SUT.getSymbolToDraw(cell);
    }
}
