package test.integration.game;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Test;
import test.integration.game.base.GameOfLifeBaseTest;

import static com.oramon.kata.cell.enums.CELL_STATE.ALIVE;
import static com.oramon.kata.cell.enums.CELL_STATE.DEATH;
import static org.junit.Assert.assertEquals;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 8/06/17 14:30
 */
public class ACellWithMoreThanThreeNeighboursDiesTest extends GameOfLifeBaseTest {

    @Test
    @SuppressWarnings("Duplicates")
    public void nextGeneration_ACellWithMoreThanThreeLiveNeighbours_ShouldDie() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, ALIVE)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, ALIVE), new Cell(ID_SIX, ALIVE)},
                new Cell[]{new Cell(ID_SEVEN, ALIVE), new Cell(ID_EIGHT, ALIVE), new Cell(ID_NINE, ALIVE)}};

        world = new MatrixWorld(arrayCell);


        SUT = new GameOfLife(world, drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "101\n" +
                        "000\n" +
                        "101\n";

        assertEquals("The next generation world should be", expected, result);
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void nextGeneration_ACellWithTwoOrThreeCellsAsNeighbours_ShouldLive() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, ALIVE), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, ALIVE)}};

        world = new MatrixWorld(arrayCell);

        SUT = new GameOfLife(world, drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "110\n" +
                        "100\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }

    /*@Test
    @SuppressWarnings("Duplicates")
    public void nextGeneration_ACellWithTwoOrMoreCellsThanTwoLiveNeighbours_ShouldLive() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, ALIVE), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, ALIVE)}};

        world = new MatrixWorld(arrayCell);

        SUT = new GameOfLife(world, drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "110\n" +
                        "100\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }*/
}
