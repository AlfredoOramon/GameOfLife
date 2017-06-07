package test.com.oramon.kata.world.impl.matrixcoordinate;

import com.oramon.kata.world.impl.MatrixCoordinate;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 12:15
 */
@RunWith(JUnitParamsRunner.class)
public class MatrixCoordinateTest {

    private MatrixCoordinate SUT;

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getNumbers() {
        return new Object[]{
                new Object[]{1},
                new Object[]{2},
                new Object[]{4},
                new Object[]{5},
                new Object[]{6},
                new Object[]{7},
        };
    }

    @Test
    @Parameters(method = "getNumbers")
    public void testWidth(int expectedWidth)
    {
        SUT = new MatrixCoordinate(expectedWidth,0);
        int widthResult=SUT.getWidth();
        assertThat("The width should be"+ expectedWidth, expectedWidth, is(widthResult));
    }

    @Test
    @Parameters(method = "getNumbers")
    public void testHeight(int expectedHeight) {
        SUT = new MatrixCoordinate(0, expectedHeight);
        int heightResult = SUT.getHeight();
        assertThat("The width should be" + expectedHeight, expectedHeight, is(expectedHeight));
    }

}