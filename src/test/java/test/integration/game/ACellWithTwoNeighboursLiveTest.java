package test.integration.game;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Test;
import test.integration.game.base.GameOfLifeBaseTest;

import static org.junit.Assert.assertEquals;
import static com.oramon.kata.cell.enums.CELL_STATE.ALIVE;
import static com.oramon.kata.cell.enums.CELL_STATE.DEATH;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 8/06/17 14:30
 */
public class ACellWithTwoNeighboursLiveTest extends GameOfLifeBaseTest {

    @Test
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldDie() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, DEATH), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, DEATH), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        world = new MatrixWorld(arrayCell);


        SUT = new GameOfLife(world,drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "000\n" +
                        "000\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }

    @Test
    public void nextGeneration_ACellWithTwoOrMoreCellsThanTwoLiveNeighbours_ShouldLive() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        world = new MatrixWorld(arrayCell);

        SUT = new GameOfLife(world,drawWorldStrategy,liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "100\n" +
                        "000\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }
}
