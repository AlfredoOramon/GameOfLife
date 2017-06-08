package test.com.oramon.kata;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.draw.impl.DrawCellStrategyImpl;
import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStrategyImpl;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
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
public class GameOfLifeTest {

    private Cell firstCell=new Cell(ID_ONE, CELL_STATE.ALIVE);
    private Cell secondCell=new Cell(ID_TWO,CELL_STATE.DEATH);
    private Cell thirdCell= new Cell(ID_THREE,CELL_STATE.DEATH);
    private Cell fourthCell = new Cell(ID_FOUR, CELL_STATE.ALIVE);
    private Cell fifthCell = new Cell(ID_FIVE, CELL_STATE.ALIVE);
    private Cell sixthCell = new Cell(ID_SIX, CELL_STATE.ALIVE);
    private Cell seventh = new Cell(ID_SEVEN, CELL_STATE.ALIVE);
    private Cell eightCell = new Cell(ID_EIGHT, CELL_STATE.ALIVE);
    private Cell ninthCell = new Cell(ID_NINE, CELL_STATE.ALIVE);

    private static final int ID_ONE = 1;
    private static final int ID_TWO = 2;
    private static final int ID_THREE = 3;
    private static final int ID_FOUR = 4;
    private static final int ID_FIVE = 5;
    private static final int ID_SIX = 6;
    private static final int ID_SEVEN = 7;
    private static final int ID_EIGHT = 8;
    private static final int ID_NINE = 9;

    private Cell[][] getWorldOfThreeByThree() {
        return new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};
    }

    private static final String VALUE_ALIVE_ONE = "1";
    private static final String VALUE_DEATH_ZERO = "0";
    private static final String VALUE_DEATH_HYPHEN = "-";
    private static final String VALUE_ALIVE_STAR = "*";

    private GameOfLife SUT;
    private LiveEvolutionMatrixWorldStrategy liveEvolutionMatrixWorldStrategy;
    private MatrixWorld world;

    @Before
    public void setUp() {
        liveEvolutionMatrixWorldStrategy=new LiveEvolutionMatrixWorldStrategyImpl();
        world= new MatrixWorld(getWorldOfThreeByThree());
        SUT = new GameOfLife(world, new DrawCellStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO),liveEvolutionMatrixWorldStrategy);
    }

    @Test
    public void PrintWorldWithOnesAndZeros()
    {
        String expected="100\n" +
                        "111\n" +
                        "111\n";

        SUT = new GameOfLife(world,new DrawCellStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO),liveEvolutionMatrixWorldStrategy);
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

        final DrawCellStrategyImpl drawStrategy = new DrawCellStrategyImpl(VALUE_ALIVE_STAR, VALUE_DEATH_HYPHEN);
        SUT = new GameOfLife(world, drawStrategy,liveEvolutionMatrixWorldStrategy);
        String result=SUT.printWorld();

        assertEquals("It should be this world",expected,result);
    }

    @Test
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldDie()
    {
        SUT = new GameOfLife(world,new DrawCellStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO),liveEvolutionMatrixWorldStrategy);
        String result=SUT.nextGenerationWorld();

        String expected=
                        "0000\n" +
                        "0000\n" +
                        "0000\n" +
                        "0000\n";

        assertEquals("The next generation world should be",expected,result);
    }

    @Test
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldLive()
    {
        SUT = new GameOfLife(world,new DrawCellStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO),liveEvolutionMatrixWorldStrategy);
        String result=SUT.nextGenerationWorld();

        String expected=
                        "0000\n" +
                        "0000\n" +
                        "0000\n" +
                        "0000\n";

        assertEquals("The next generation world should be",expected,result);
    }
}
