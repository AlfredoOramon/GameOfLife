package test.com.oramon.kata.world.impl.matrixworld;

import com.oramon.kata.cell.data.Cell;
import com.oramon.kata.cell.enums.CELL_STATE;
import com.oramon.kata.world.data.MatrixCoordinate;
import com.oramon.kata.world.impl.MatrixWorld;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import test.com.oramon.kata.world.impl.matrixworld.base.MatrixWorldBaseTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 6/06/17 9:12
 */
@RunWith(JUnitParamsRunner.class)
public class GetNeighboursMatrixWorldTest extends MatrixWorldBaseTest {

    private static final int SIZE_FIVE = 5;
    private static final int SIZE_THREE = 3;
    private static final int SIZE_EIGHT = 8;

    private MatrixWorld SUT;

    private static Cell firstCell=new Cell(ID_ONE, CELL_STATE.ALIVE);
    private static Cell secondCell=new Cell(ID_TWO,CELL_STATE.DEATH);
    private static Cell thirdCell= new Cell(ID_THREE,CELL_STATE.DEATH);
    private static Cell fourthCell = new Cell(ID_FOUR, CELL_STATE.ALIVE);
    private static Cell fifthCell = new Cell(ID_FIVE, CELL_STATE.ALIVE);
    private static Cell sixthCell = new Cell(ID_SIX, CELL_STATE.ALIVE);
    private static Cell seventh = new Cell(ID_SEVEN, CELL_STATE.ALIVE);
    private static Cell eightCell = new Cell(ID_EIGHT, CELL_STATE.ALIVE);
    private static Cell ninthCell = new Cell(ID_NINE, CELL_STATE.ALIVE);



    @Before
    public void setup() {

        Cell[][] cellArray = new Cell[][]{
                new Cell[]{firstCell, secondCell, thirdCell},
                new Cell[]{fourthCell, fifthCell, sixthCell},
                new Cell[]{seventh, eightCell, ninthCell}};

        SUT = new MatrixWorld(cellArray);
    }

    //In gogle drive there is a good book that explain this practical unit testing with junit and mockito
    private static final Object[] getListOfNeighboursForCoordinates() {

        return new Object[]{
                /*FirstCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ZERO, HEIGHT_ZERO),//Given
                        SIZE_THREE, new Cell[]{secondCell, fourthCell, fifthCell} //Expected
                },
                /*SecondCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ONE, HEIGHT_ZERO),//Given
                        SIZE_FIVE, new Cell[]{firstCell, thirdCell, fourthCell, fifthCell, sixthCell} //Expected
                },
                /*ThirdCell*/
                new Object[]{new MatrixCoordinate(WIDTH_TWO, HEIGHT_ZERO),//Given
                        SIZE_THREE, new Cell[]{secondCell, fifthCell, sixthCell} //Expected
                },
                /*FourthCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ZERO, HEIGHT_ONE),//Given
                        SIZE_FIVE, new Cell[]{fifthCell, secondCell, fifthCell, seventh, eightCell} //Expected
                },
                /*FifthCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ONE, HEIGHT_ONE),//Given
                        SIZE_EIGHT, new Cell[]{firstCell, secondCell, thirdCell, fourthCell, sixthCell, seventh, eightCell, ninthCell} //Expected
                },
                /*sixthCell*/
                new Object[]{new MatrixCoordinate(WIDTH_TWO, HEIGHT_ONE),//Given
                        SIZE_FIVE, new Cell[]{secondCell, thirdCell, fifthCell, eightCell, ninthCell} //Expected
                },

                /*seventhCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ZERO, HEIGHT_TWO),//Given
                        SIZE_THREE, new Cell[]{fourthCell, fifthCell, eightCell} //Expected
                },
                /*eightCell*/
                new Object[]{new MatrixCoordinate(WIDTH_ONE, HEIGHT_TWO),//Given
                        SIZE_FIVE, new Cell[]{fourthCell,fifthCell, sixthCell, seventh, ninthCell} //Expected
                },
                /*ninthCell*/
                new Object[]{new MatrixCoordinate(WIDTH_TWO, HEIGHT_TWO),//Given
                        SIZE_THREE, new Cell[]{fifthCell, sixthCell, eightCell} //Expected
                },
        };
    }

    @Test
    @Parameters(method = "getListOfNeighboursForCoordinates")
    public void forTheMatrixCell_ShouldReturnProperSizeListWithArrayOfCells(MatrixCoordinate cellMatrix,int sizeExpected, Cell[] expectedNeighbours) {
        List<Cell> result = SUT.getNeighboursOfACell(cellMatrix);

        assertThat(result).hasSize(sizeExpected)
                .contains(expectedNeighbours);
    }































}
