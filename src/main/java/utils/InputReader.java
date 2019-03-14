package utils;

import commands.Command;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputReader {


    private BufferedReader br;


    public InputReader(String filePath) throws FileNotFoundException {
        this.br = new BufferedReader(new FileReader(filePath));
    }

    public List<String> getCommandList() throws IOException {
        String commandLine;
        List<String> commandList = new ArrayList<>();
        while ((commandLine = br.readLine()) != null) {
            commandList.add(commandLine);
        }
        return commandList;
    }

//    public InputReader(String fileName) {
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String currentLine;
//            while ((currentLine = br.readLine()) != null) {
//                Command command = CommandFactory.getCommand(currentLine);
//                command.executeCommand();
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("file is not found");
//        } catch (IOException e) {
//            System.err.println("IO Error");
//        }
//    }

}
