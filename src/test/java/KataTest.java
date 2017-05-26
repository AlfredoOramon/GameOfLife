
import com.oramon.kata.GameOfLife;
import com.oramon.kata.draw.impl.DrawStrategyImpl;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 9:10
 */
@RunWith(JUnitParamsRunner.class)
public class KataTest {

    public static final String VALUE_ALIVE_ONE = "1";
    public static final String VALUE_DEATH_ZERO = "0";
    private static final String VALUE_DEATH_HYPHEN = "-";
    private static final String VALUE_ALIVE_STAR = "*";
    private GameOfLife SUT;
    private int[][] world;

    @Before
    public void setUp() {
        world=createInitialWorld();
        SUT = new GameOfLife(world,new DrawStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO));
    }

    private int[][] createInitialWorld() {
        int[][] result = new int[4][8];
        result[0][0]=1;
        return result;
    }

    @Test
    public void CheckThatTheWorldExist() {

        int[][] expected= createInitialWorld();

        int[][] result=SUT.getWorld();

        assertEquals("It should be true",expected,result);
    }

    @Test
    public void PrintWorldWithOnesAndZeros()
    {
        String expected=
                        "10000000\n" +
                        "00000000\n" +
                        "00000000\n" +
                        "00000000\n";

        SUT = new GameOfLife(world,new DrawStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO));
        String result=SUT.printWorld();
        System.out.print(result);

        assertEquals("It should be this world",expected,result);
    }
    @Test
    public void PrintWorldWithHyphensAndZeros()
    {
        String expected=
                        "*-------\n" +
                        "--------\n" +
                        "--------\n" +
                        "--------\n";

        SUT = new GameOfLife(world,new DrawStrategyImpl(VALUE_ALIVE_STAR, VALUE_DEATH_HYPHEN));
        String result=SUT.printWorld();
        System.out.print(result);

        assertEquals("It should be this world",expected,result);
    }
}
