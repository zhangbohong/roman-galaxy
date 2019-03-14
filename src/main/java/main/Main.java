package main;

import commands.Command;
import utils.CommandFactory;
import utils.InputReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            InputReader reader = new InputReader("src/main/resources/Input.txt");
            List<String> commandList = reader.getCommandList();
            for (String commandLine : commandList) {
                Command command = CommandFactory.getCommand(commandLine);
                command.executeCommand();
            }
        } catch (FileNotFoundException e) {
            System.err.println(" file is not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
