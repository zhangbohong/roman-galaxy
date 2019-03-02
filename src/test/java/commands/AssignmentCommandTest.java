package commands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * AssignmentCommand Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Feb 28, 2019</pre>
 */
public class AssignmentCommandTest {

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
        AssignmentCommand assignmentCommand = new AssignmentCommand("glob is I");
        assignmentCommand.executeCommand();

    }


} 
