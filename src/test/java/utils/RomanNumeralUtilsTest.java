package utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.stream.Stream;

/**
 * RomanNumeralUtils Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 28, 2019</pre>
 */
public class RomanNumeralUtilsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isValidRomanNumeral(String romanStr)
     */
    @Test
    public void testIsValidRomanNumeral() throws Exception {
        boolean IVX = RomanNumeralUtils.isValidRomanNumeral("IVX");
        System.out.println(IVX);

    }

    /**
     * Method: getValueFromRomanStr(String romanStr)
     */
    @Test
    public void testGetValueFromRomanStr() throws Exception {
        int ivx = RomanNumeralUtils.getValueFromRomanStr("CMI");
        System.out.println(ivx);


    }


} 
