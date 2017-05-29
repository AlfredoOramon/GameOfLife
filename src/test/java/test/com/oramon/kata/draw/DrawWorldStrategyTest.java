package test.com.oramon.kata.draw;

import com.oramon.kata.DrawWorldStrategy;
import com.oramon.kata.draw.DrawStrategy;
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

    private DrawWorldStrategy SUT;
    private DrawStrategy drawStrategy;

    @Before
    public void setUp() {
        drawStrategy=mock(DrawStrategy.class);
        SUT = new DrawWorldStrategy(drawStrategy);
    }

    private int[][] createInitialWorld() {
        int[][] result = new int[3][3];
        result[0][0] = 1;
        result[0][1] = 2;
        result[0][2] = 3;

        result[1][0] = 4;
        result[1][1] = 5;
        result[1][2] = 6;

        result[2][0] = 7;
        result[2][1] = 8;
        result[2][2] = 9;

        return result;
    }

    @Test
    public void printCellsOfTheWorld() {
        String expected =
                "123\n" +
                        "456\n" +
                        "789\n";

        when(drawStrategy.getSymbolToDraw(1)).thenReturn("1");
        when(drawStrategy.getSymbolToDraw(2)).thenReturn("2");
        when(drawStrategy.getSymbolToDraw(3)).thenReturn("3");
        when(drawStrategy.getSymbolToDraw(4)).thenReturn("4");
        when(drawStrategy.getSymbolToDraw(5)).thenReturn("5");
        when(drawStrategy.getSymbolToDraw(6)).thenReturn("6");
        when(drawStrategy.getSymbolToDraw(7)).thenReturn("7");
        when(drawStrategy.getSymbolToDraw(8)).thenReturn("8");
        when(drawStrategy.getSymbolToDraw(9)).thenReturn("9");

        String result =SUT.printworld(createInitialWorld());


        verify(drawStrategy,times(1)).getSymbolToDraw(1);
        verify(drawStrategy,times(1)).getSymbolToDraw(2);
        verify(drawStrategy,times(1)).getSymbolToDraw(3);
        verify(drawStrategy,times(1)).getSymbolToDraw(4);
        verify(drawStrategy,times(1)).getSymbolToDraw(5);
        verify(drawStrategy,times(1)).getSymbolToDraw(6);
        verify(drawStrategy,times(1)).getSymbolToDraw(7);
        verify(drawStrategy,times(1)).getSymbolToDraw(8);
        verify(drawStrategy,times(1)).getSymbolToDraw(9);


        assertEquals("It should be this world", expected, result);
    }
}