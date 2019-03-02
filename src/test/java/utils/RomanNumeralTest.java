package utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

/**
 * RomanNumeral Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 28, 2019</pre>
 */
public class RomanNumeralTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getValue()
     */
    @Test
    public void testGetValue() throws Exception {
        System.out.println(RomanNumeral.valueOf("C").getValue());
    }


} 
