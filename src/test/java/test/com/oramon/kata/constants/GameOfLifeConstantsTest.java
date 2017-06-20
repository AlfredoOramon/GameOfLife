package test.com.oramon.kata.constants;

import com.oramon.kata.constants.GameOfLifeConstants;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

/**
 * ClassName
 * <p>
 * Created by Alfredo Gil Rubio
 * <p>
 * Date: 8/06/17 14:07
 */
public class GameOfLifeConstantsTest {

    @Test
    public void testConstructorIsPrivate() throws Exception {
        Constructor constructor = GameOfLifeConstants.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}