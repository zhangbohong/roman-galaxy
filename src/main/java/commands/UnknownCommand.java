package commands;

import processors.impl.UnknownQuestionImpl;

public class UnknownCommand extends Command {

    UnknownCommand() {

    }

    public UnknownCommand(String commandLine) {
        super(commandLine);
    }

    @Override
    public void executeCommand() {
        String commandLine = getCommandLine();
        new UnknownQuestionImpl().processor(commandLine);
    }
}
