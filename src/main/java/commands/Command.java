package commands;

import handler.ReadLineHandler;

public abstract class Command {

    private ReadLineHandler readLineHandler;

    private String commandLine;

    public abstract void executeCommand();

    Command() {
        this(null);
    }

    Command(String commandLine) {
        this.commandLine = commandLine;
        readLineHandler = ReadLineHandler.getInstance();
    }

    ReadLineHandler getReadLineHandler() {
        return readLineHandler;
    }

    String getCommandLine() {
        return commandLine;
    }
}
