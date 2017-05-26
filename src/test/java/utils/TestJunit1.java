package utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

    private SystemUnderTest SUT;

    @Before
    public void setup()
    {
        SUT = new SystemUnderTest();
    }

    //https://dzone.com/articles/7-popular-unit-test-naming
    @Test
    public void methodName_StateUnderTest_expectedBehavior() {
        Assert.assertTrue(true);
    }

    @Test
    public void printNumber_testPrintMessage() {

        String expected = "example";

        String result = SUT.printResult();

        assertEquals("Should return:" + expected, expected, result);
    }

    //This class will be the class under src/main/java, I put it here as an example.
    class SystemUnderTest {
        public String printResult() {
            return "example";
        }
    }
}