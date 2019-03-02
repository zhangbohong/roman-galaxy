package commands;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Map;

/**
 * QuestionCommand Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Mar 2, 2019</pre>
 */
public class QuestionCommandTest {

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
        QuestionCommand questionCommand = new QuestionCommand("how much is pish tegj glob glob ?");
        QuestionCommand questionCommand1 = new QuestionCommand("how many Credits is glob prok Silver ?");
        QuestionCommand questionCommand2 = new QuestionCommand("how many Credits is glob prok Gold ?");
        QuestionCommand questionCommand3 = new QuestionCommand("how many Credits is glob prok Iron ?");
        UnknownCommand unknownCommand = new UnknownCommand("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?");
        Map<String, Object> romanMap = questionCommand.getReadLineHandler().getRomanMap();
        romanMap.put("glob", "I=1");
        romanMap.put("prok", "V=5");
        romanMap.put("pish", "X=10");
        romanMap.put("tegj", "L=50");
        Map<String, Object> materialMap = questionCommand.getReadLineHandler().getMaterialMap();
        materialMap.put("Silver", "17");
        materialMap.put("Gold", "14450");
        materialMap.put("Iron", "195.5");

        questionCommand.executeCommand();
        questionCommand1.executeCommand();
        questionCommand2.executeCommand();
        questionCommand3.executeCommand();
        unknownCommand.executeCommand();
    }


} 
