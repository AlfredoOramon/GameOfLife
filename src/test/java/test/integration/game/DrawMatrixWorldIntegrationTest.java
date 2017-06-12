package test.integration.game;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.impl.DrawMatrixWorldStrategyImpl;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.draw.impl.DrawCellStrategyImpl;
import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStrategyImpl;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import test.integration.game.base.GameOfLifeBaseTest;

import static org.junit.Assert.assertEquals;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 15/05/17 9:10
 */
@RunWith(JUnitParamsRunner.class)
public class DrawMatrixWorldIntegrationTest extends GameOfLifeBaseTest {

    @Test
    public void PrintWorldWithOnesAndZeros()
    {
        String expected="100\n" +
                        "111\n" +
                        "111\n";

        SUT = new GameOfLife(world,drawWorldStrategy,liveEvolutionMatrixWorldStrategy);
        String result=SUT.printWorld();

        assertEquals("It should be this world",expected,result);
    }

    @Test
    public void PrintWorldWithHyphensAndZeros()
    {
        String expected=
                        "*--\n" +
                        "***\n" +
                        "***\n";

        drawWorldStrategy=new DrawMatrixWorldStrategyImpl(new DrawCellStrategyImpl(VALUE_ALIVE_STAR, VALUE_DEATH_HYPHEN));
        SUT = new GameOfLife(world, drawWorldStrategy,liveEvolutionMatrixWorldStrategy);
        String result=SUT.printWorld();

        assertEquals("It should be this world",expected,result);
    }
}
