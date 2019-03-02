package commands;

import utils.RomanNumeral;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentCommand extends Command {

    public AssignmentCommand() {

    }

    public AssignmentCommand(String commandLine) {
        super(commandLine);
    }

    @Override
    public void executeCommand() {
        String commandLine = getCommandLine();
        Map<String, Object> romanMap = getReadLineHandler().getRomanMap();
        Map<String, String> map = Stream.of(commandLine).
                map(s -> s.split("\\sis\\s")).
                collect(Collectors.toMap(
                        s -> s[0],
                        s -> s[1] + "=" + RomanNumeral.valueOf(s[1]).getValue())
                );
        romanMap.putAll(map);
    }
}
