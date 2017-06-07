package test.com.oramon.kata.world.impl.matrixworld.base;

import com.oramon.kata.Cell;
import com.oramon.kata.cell.CELL_STATE;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 5/06/17 14:26
 */
public class MatrixWorldBaseTest {

    protected static final int ID_ONE = 1;
    protected static final int ID_TWO = 2;
    protected static final int ID_THREE = 3;
    protected static final int ID_FOUR = 4;
    protected static final int ID_FIVE = 5;
    protected static final int ID_SIX = 6;
    protected static final int ID_SEVEN = 7;
    protected static final int ID_EIGHT = 8;
    protected static final int ID_NINE = 9;

    protected static final int WIDTH_ZERO = 0;
    protected static final int WIDTH_ONE = 1;
    protected static final int WIDTH_TWO = 2;
    protected static final int WIDTH_THIRD = 2;

    protected static final int HEIGHT_ZERO = 0;
    protected static final int HEIGHT_ONE = 1;
    protected static final int HEIGHT_TWO = 2;




    protected Cell[][] getWorldOfThreeByThree() {
        return new Cell[][]{
                new Cell[]{new Cell(ID_ONE, CELL_STATE.ALIVE), new Cell(ID_TWO,CELL_STATE.DEATH), new Cell(ID_THREE,CELL_STATE.DEATH)},
                new Cell[]{new Cell(ID_FOUR,CELL_STATE.ALIVE), new Cell(ID_FIVE,CELL_STATE.ALIVE), new Cell(ID_SIX,CELL_STATE.ALIVE)},
                new Cell[]{new Cell(ID_SEVEN,CELL_STATE.ALIVE), new Cell(ID_EIGHT,CELL_STATE.ALIVE), new Cell(ID_NINE,CELL_STATE.ALIVE)}
        };
    }

    protected Cell[][] getWorldOfFourByFour() {
        return new Cell[][]{
                new Cell[]{new Cell(ID_ONE, CELL_STATE.ALIVE), new Cell(ID_TWO, CELL_STATE.DEATH), new Cell(ID_THREE, CELL_STATE.DEATH), new Cell(ID_THREE, CELL_STATE.DEATH)},
                new Cell[]{new Cell(ID_FOUR, CELL_STATE.ALIVE), new Cell(ID_FIVE, CELL_STATE.ALIVE), new Cell(ID_SIX, CELL_STATE.ALIVE), new Cell(ID_THREE, CELL_STATE.DEATH)},
                new Cell[]{new Cell(ID_SEVEN, CELL_STATE.ALIVE), new Cell(ID_EIGHT, CELL_STATE.ALIVE), new Cell(ID_NINE, CELL_STATE.ALIVE), new Cell(ID_THREE, CELL_STATE.DEATH)},
                new Cell[]{new Cell(ID_SEVEN, CELL_STATE.ALIVE), new Cell(ID_EIGHT, CELL_STATE.ALIVE), new Cell(ID_NINE, CELL_STATE.ALIVE), new Cell(ID_THREE, CELL_STATE.DEATH)
                }
        };
    }
}
