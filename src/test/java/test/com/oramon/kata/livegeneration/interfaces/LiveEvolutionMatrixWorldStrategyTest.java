package test.com.oramon.kata.livegeneration.interfaces;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStrategyImpl;

import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import com.oramon.kata.world.interfaces.World;
import org.junit.Assert;
import org.junit.Test;

import static com.oramon.kata.cell.enums.CELL_STATE.ALIVE;
import static com.oramon.kata.cell.enums.CELL_STATE.DEATH;
import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 30/05/17 11:31
 */
public class LiveEvolutionMatrixWorldStrategyTest {

    protected static final int ID_ONE = 1;
    protected static final int ID_TWO = 2;
    protected static final int ID_THREE = 3;
    protected static final int ID_FOUR = 4;
    protected static final int ID_FIVE = 5;
    protected static final int ID_SIX = 6;
    protected static final int ID_SEVEN = 7;
    protected static final int ID_EIGHT = 8;
    protected static final int ID_NINE = 9;

    LiveEvolutionMatrixWorldStrategy SUT;

    public void setup()
    {

        SUT = new LiveEvolutionMatrixWorldStrategyImpl();
    }

    @Test
    public void getNextGenerationWorld_ACellWithFewerThanTwoLiveNeighbours_ShouldDie() {
        Cell[][] arrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, ALIVE), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, ALIVE), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        MatrixWorld world = new MatrixWorld(arrayCell);
        MatrixWorld result = SUT.createNextGenerationWorld(world);

        Cell[][] newArrayCell = new Cell[][]{
                new Cell[]{new Cell(ID_ONE, ALIVE), new Cell(ID_TWO, DEATH), new Cell(ID_THREE, DEATH)},
                new Cell[]{new Cell(ID_FOUR, DEATH), new Cell(ID_FIVE, DEATH), new Cell(ID_SIX, DEATH)},
                new Cell[]{new Cell(ID_SEVEN, DEATH), new Cell(ID_EIGHT, DEATH), new Cell(ID_NINE, DEATH)}};

        MatrixWorld newMatrixWorld = new MatrixWorld(newArrayCell);

        Assert.assertEquals("All World Should be death", newMatrixWorld, result);
    }
}