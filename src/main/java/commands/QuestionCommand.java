package commands;

import processors.impl.HowManyQuestionImpl;
import processors.impl.HowMuchQuestionsImpl;
import utils.QuestionTypes;

public class QuestionCommand extends Command {

    QuestionCommand() {

    }

    public QuestionCommand(String commandLine) {
        super(commandLine);
    }

    @Override
    public void executeCommand() {
        String commandLine = getCommandLine();
        if (commandLine.startsWith(QuestionTypes.HOW_MUCH_QUESTION.getQuestionStr())) {
            new HowMuchQuestionsImpl().processor(commandLine);
        } else if (commandLine.startsWith(QuestionTypes.HOW_MANY_QUESTION.getQuestionStr())) {
            new HowManyQuestionImpl().processor(commandLine);
        }
    }
}
