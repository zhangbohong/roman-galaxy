package utils;

import commands.Command;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputReader {

    public InputReader(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                Command command = CommandFactory.getCommand(currentLine);
                command.executeCommand();
            }
        } catch (FileNotFoundException e) {
            System.err.println("file is not found");
        } catch (IOException e) {
            System.err.println("IO Error");
        }
    }
}
