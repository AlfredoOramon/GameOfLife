package test.com.oramon.kata.drawworld;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.draw.DrawWorldStrategy;
import com.oramon.kata.draw.impl.DrawMatrixWorldStrategyImpl;
import com.oramon.kata.draw.DrawCellStrategy;
import com.oramon.kata.world.impl.MatrixWorld;
import org.junit.Before;
import org.junit.Test;

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
 * Date: 29/05/17 9:42
 */
public class DrawWorldStrategyTest {

    protected Cell firstCell=new Cell(ID_ONE, CELL_STATE.ALIVE);
    protected Cell secondCell=new Cell(ID_TWO,CELL_STATE.DEATH);
    protected Cell thirdCell= new Cell(ID_THREE,CELL_STATE.DEATH);
    protected Cell fourthCell = new Cell(ID_FOUR, CELL_STATE.ALIVE);
    protected Cell fifthCell = new Cell(ID_FIVE, CELL_STATE.ALIVE);
    protected Cell sixthCell = new Cell(ID_SIX, CELL_STATE.ALIVE);
    protected Cell seventh = new Cell(ID_SEVEN, CELL_STATE.ALIVE);
    protected Cell eightCell = new Cell(ID_EIGHT, CELL_STATE.ALIVE);
    protected Cell ninthCell = new Cell(ID_NINE, CELL_STATE.ALIVE);

    protected static final int ID_ONE = 1;
    protected static final int ID_TWO = 2;
    protected static final int ID_THREE = 3;
    protected static final int ID_FOUR = 4;
    protected static final int ID_FIVE = 5;
    protected static final int ID_SIX = 6;
    protected static final int ID_SEVEN = 7;
    protected static final int ID_EIGHT = 8;
    protected static final int ID_NINE = 9;

    protected Cell[][] getWorldOfThreeByThree() {
        Cell[][] cellArray = new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};
        return cellArray;
    }

    private DrawWorldStrategy SUT;
    private DrawCellStrategy drawStrategy;

    @Before
    public void setUp() {
        drawStrategy=mock(DrawCellStrategy.class);
        SUT = new DrawMatrixWorldStrategyImpl(drawStrategy);
    }

    @Test
    public void printCellsOfAndArray() {
        String expected =
                "123\n" +
                        "456\n" +
                        "789\n";

        when(drawStrategy.getSymbolToDraw(firstCell)).thenReturn("1");
        when(drawStrategy.getSymbolToDraw(secondCell)).thenReturn("2");
        when(drawStrategy.getSymbolToDraw(thirdCell)).thenReturn("3");
        when(drawStrategy.getSymbolToDraw(fourthCell)).thenReturn("4");
        when(drawStrategy.getSymbolToDraw(fifthCell)).thenReturn("5");
        when(drawStrategy.getSymbolToDraw(sixthCell)).thenReturn("6");
        when(drawStrategy.getSymbolToDraw(seventh)).thenReturn("7");
        when(drawStrategy.getSymbolToDraw(eightCell)).thenReturn("8");
        when(drawStrategy.getSymbolToDraw(ninthCell)).thenReturn("9");

        String result =SUT.printWorld(new MatrixWorld(getWorldOfThreeByThree()));

        verify(drawStrategy,times(1)).getSymbolToDraw(firstCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(secondCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(thirdCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(fourthCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(fifthCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(sixthCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(seventh);
        verify(drawStrategy,times(1)).getSymbolToDraw(eightCell);
        verify(drawStrategy,times(1)).getSymbolToDraw(ninthCell);

        assertEquals("It should be this world", expected, result);
    }
}