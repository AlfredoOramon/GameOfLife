package test.integration.game.base;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.DrawWorldStrategy;
import com.oramon.kata.draw.impl.DrawCellStrategyImpl;
import com.oramon.kata.draw.impl.DrawMatrixWorldStrategyImpl;
import com.oramon.kata.game.GameOfLife;
import com.oramon.kata.livegeneration.impl.LiveEvolutionMatrixWorldStrategyImpl;
import com.oramon.kata.livegeneration.interfaces.LiveEvolutionMatrixWorldStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Before;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 8/06/17 14:31
 */
public class GameOfLifeBaseTest {

    protected static final String VALUE_ALIVE_ONE = "1";
    protected static final String VALUE_DEATH_ZERO = "0";
    protected static final String VALUE_DEATH_HYPHEN = "-";
    protected static final String VALUE_ALIVE_STAR = "*";

    private Cell firstCell=new Cell(ID_ONE, CELL_STATE.ALIVE);
    private Cell secondCell=new Cell(ID_TWO,CELL_STATE.DEATH);
    private Cell thirdCell= new Cell(ID_THREE,CELL_STATE.DEATH);
    private Cell fourthCell = new Cell(ID_FOUR, CELL_STATE.ALIVE);
    private Cell fifthCell = new Cell(ID_FIVE, CELL_STATE.ALIVE);
    private Cell sixthCell = new Cell(ID_SIX, CELL_STATE.ALIVE);
    private Cell seventh = new Cell(ID_SEVEN, CELL_STATE.ALIVE);
    private Cell eightCell = new Cell(ID_EIGHT, CELL_STATE.ALIVE);
    private Cell ninthCell = new Cell(ID_NINE, CELL_STATE.ALIVE);

    protected static final int ID_ONE = 1;
    protected static final int ID_TWO = 2;
    protected static final int ID_THREE = 3;
    protected static final int ID_FOUR = 4;
    protected static final int ID_FIVE = 5;
    protected static final int ID_SIX = 6;
    protected static final int ID_SEVEN = 7;
    protected static final int ID_EIGHT = 8;
    protected static final int ID_NINE = 9;
    protected DrawMatrixWorldStrategyImpl drawWorldStrategy;

    private Cell[][] getWorldOfThreeByThree() {
        return new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};
    }

    protected GameOfLife SUT;
    protected LiveEvolutionMatrixWorldStrategy liveEvolutionMatrixWorldStrategy;
    protected MatrixWorld world;

    @Before
    public void setUp() {
        liveEvolutionMatrixWorldStrategy=new LiveEvolutionMatrixWorldStrategyImpl();
        world= new MatrixWorld(getWorldOfThreeByThree());
        drawWorldStrategy=new DrawMatrixWorldStrategyImpl(new DrawCellStrategyImpl(VALUE_ALIVE_ONE, VALUE_DEATH_ZERO));
        SUT = new GameOfLife(world,drawWorldStrategy,liveEvolutionMatrixWorldStrategy);
    }
    
}
