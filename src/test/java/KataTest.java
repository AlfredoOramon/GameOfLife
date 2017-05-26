import com.fizzbuzz.impl.FizzBuzzImpl;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
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
public class KataTest {

    //private KataInitializer SUT;

    @Before
    public void setUp() {
        //SUT = new KataInitializer();
    }

    @Test
    public void firstTest() {

        boolean expected=true;

        assertEquals("It should be true",expected, true);
    }
}
