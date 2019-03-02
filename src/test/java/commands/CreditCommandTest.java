package commands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

/**
 * CreditCommand Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 28, 2019</pre>
 */
public class CreditCommandTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: executeCommand(String commandLine)
     */
    @Test
    public void testExecuteCommand() throws Exception {

        CreditCommand creditCommand = new CreditCommand("glob prok Gold is 57800 Credits");
        Map<String, Object> romanMap = creditCommand.getReadLineHandler().getRomanMap();
        romanMap.put("glob", "I=1");
        romanMap.put("prok", "V=5");
        romanMap.put("pish", "X=10");
        romanMap.put("tegj", "L=50");
        creditCommand.executeCommand();
    }


} 
