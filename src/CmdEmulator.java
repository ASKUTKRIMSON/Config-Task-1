
import cmdemulator.CommandExecutor;
import cmdemulator.FileSystem;

import java.util.Scanner;

public class CmdEmulator {

    public static void main(String[] args) {

        // Hardcoded file paths (replace with your actual paths)
        String tarFilePath = "/Users/Acer/Desktop/Disciplines/Программирование на языке Java/Task-1-finale/src/arc.tar"; //
        String logFilePath = "/Users/Acer/Desktop/Disciplines/Программирование на языке Java/Task-1-finale/src/log.json";//
        String graphvizPath = "/Program Files/Graphviz/bin/dot.exe"; // /Program Files/Graphviz/bin/dot.exe

        FileSystem fileSystem = new FileSystem(tarFilePath, logFilePath);
        CommandExecutor executor = new CommandExecutor(fileSystem, graphvizPath);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(fileSystem.getCurrentDirectory() + "> ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String output = executor.executeCommand(input);
            fileSystem.logCommand(input, output);
            System.out.println(output);
        }

        scanner.close();
    }
}