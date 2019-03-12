package utils;

import commands.*;

import java.util.regex.Pattern;

public class CommandFactory {

    public static Command getCommand(final String commandLine) {
        if (RomanNumeral.contains(commandLine.trim().substring(commandLine.length() - 1))) {
            return new AssignmentCommand(commandLine);
        } else if (commandLine.trim().endsWith("Credits")) {
            return new CreditCommand(commandLine);
        } else if (commandLine.trim().endsWith("?")) {
            return new QuestionCommand(commandLine);
        } else {
            return new UnknownCommand(commandLine);
        }
    }
}
