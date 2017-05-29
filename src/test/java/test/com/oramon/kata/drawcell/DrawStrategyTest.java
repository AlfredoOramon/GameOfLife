package test.com.oramon.kata.drawcell;

import com.oramon.kata.draw.DrawStrategy;
import com.oramon.kata.draw.impl.DrawStrategyImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 26/05/17 15:06
 */
@RunWith(JUnitParamsRunner.class)
public class DrawStrategyTest {

    public static final String VALUE_ALIVE_ONE = "1";
    public static final String VALUE_DEATH_ZERO = "0";
    private static final String VALUE_DEATH_HYPHEN = "-";
    private static final String VALUE_ALIVE_STAR = "*";
    public static final int ONE_NUMBER=1;
    private static final int ZERO_NUMBER = 0;

    private DrawStrategy SUT;

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
        SUT = new DrawStrategyImpl(symbolToDraw, VALUE_DEATH_ZERO);
        String result=SUT.getSymbolToDraw(ONE_NUMBER);

        Assert.assertEquals("Should return"+ONE_NUMBER,symbolToDraw,result);
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
        SUT = new DrawStrategyImpl(symbolToDraw, VALUE_DEATH_ZERO);
        String result=SUT.getSymbolToDraw(ONE_NUMBER);

        Assert.assertEquals("Should return"+ONE_NUMBER,symbolToDraw,result);
    }
}
