package utils;

import commands.*;

import java.util.regex.Pattern;

public class CommandFactory {

    private static final Pattern assignmentPattern = Pattern.compile("(\\w+)\\s(is)\\s(" + RomanNumeralUtils.pattern + ")");

    private static final Pattern creditPattern = Pattern.compile("(.+)\\s(Silver|Gold|Iron)\\sis\\s(\\d+)\\sCredits");

    private static final Pattern howMuchQuestionPattern = Pattern.compile("how\\smuch\\sis\\s(.+)\\?");

    private static final Pattern howManyQuestionPattern = Pattern.compile("how\\smany\\sCredits\\sis\\s(.+)(Silver|Gold|Iron)\\s\\?");

    public static Command getCommand(final String commandLine) {
        if (Pattern.matches(assignmentPattern.pattern(), commandLine)) {
            return new AssignmentCommand(commandLine);
        } else if (Pattern.matches(creditPattern.pattern(), commandLine)) {
            return new CreditCommand(commandLine);
        } else if (Pattern.matches(howMuchQuestionPattern.pattern(), commandLine)) {
            return new QuestionCommand(commandLine);
        } else if (Pattern.matches(howManyQuestionPattern.pattern(), commandLine)) {
            return new QuestionCommand(commandLine);
        } else {
            return new UnknownCommand(commandLine);
        }
    }
}
