package test.com.oramon.kata.gameoflife;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.draw.DrawWorldStrategy;
import com.oramon.kata.draw.impl.DrawMatrixWorldStrategyImpl;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Test;
import test.integration.game.base.GameOfLifeBaseTest;

import static com.oramon.kata.cell.enums.CELL_STATE.ALIVE;
import static com.oramon.kata.cell.enums.CELL_STATE.DEATH;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 12/06/17 11:16
 */
public class GameOfLifeTest extends GameOfLifeBaseTest
{
    private GameOfLife SUT;
    private DrawWorldStrategy drawWorldStrategy;
    private LiveEvolutionMatrixWorldStrategy liveEvolutionMatrixWorldStrategy;

    @Test
    @SuppressWarnings("Duplicates")
    public void nextGeneration_ACellWithFewerThanTwoLiveNeighbours_ShouldDie() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, DEATH), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, DEATH), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        world = new MatrixWorld(arrayCell);
        drawWorldStrategy= mock(DrawWorldStrategy.class);
        liveEvolutionMatrixWorldStrategy=mock(LiveEvolutionMatrixWorldStrategy.class);

        Cell[][] newArrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, DEATH), new Cell(ID_TWO, DEATH), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, DEATH), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        MatrixWorld newMatrixWorld= new MatrixWorld(newArrayCell);

        when(drawWorldStrategy.printWorld(newMatrixWorld)).thenReturn("000\n000\n000\n");
        when(liveEvolutionMatrixWorldStrategy.createNextGenerationWorld(world)).thenReturn(newMatrixWorld);

        SUT = new GameOfLife(world,drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();


        String expected =
                "000\n" +
                        "000\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }

    @Test
    @SuppressWarnings("Duplicates")
    public void nextGeneration_ACellWithTwoOrMoreCellsThanTwoLiveNeighbours_ShouldLive() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        world = new MatrixWorld(arrayCell);

        world = new MatrixWorld(arrayCell);
        drawWorldStrategy= mock(DrawWorldStrategy.class);
        liveEvolutionMatrixWorldStrategy=mock(LiveEvolutionMatrixWorldStrategy.class);

        Cell[][] newArrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, DEATH), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, DEATH), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        MatrixWorld newMatrixWorld= new MatrixWorld(newArrayCell);

        when(drawWorldStrategy.printWorld(newMatrixWorld)).thenReturn("100\n000\n000\n");
        when(liveEvolutionMatrixWorldStrategy.createNextGenerationWorld(world)).thenReturn(newMatrixWorld);

        SUT = new GameOfLife(world,drawWorldStrategy, liveEvolutionMatrixWorldStrategy);
        String result = SUT.nextGenerationWorld();

        String expected =
                "100\n" +
                        "000\n" +
                        "000\n";

        assertEquals("The next generation world should be", expected, result);
    }
}
