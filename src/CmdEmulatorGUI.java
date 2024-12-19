import cmdemulator.CommandExecutor;
import cmdemulator.FileSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CmdEmulatorGUI {

    public static void main(String[] args) {
        // Hardcoded file paths (replace with your actual paths)
        String tarFilePath = "/Users/Acer/Desktop/Disciplines/Программирование на языке Java/Task-1-finale/src/arc.tar";
        String logFilePath = "/Users/Acer/Desktop/Disciplines/Программирование на языке Java/Task-1-finale/src/log.json";
        String graphvizPath = "/Program Files/Graphviz/bin/dot.exe";

        FileSystem fileSystem = new FileSystem(tarFilePath, logFilePath);
        CommandExecutor executor = new CommandExecutor(fileSystem, graphvizPath);

        // Create the main frame
        JFrame frame = new JFrame("Cmd Emulator");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel
        JPanel panel = new JPanel(new BorderLayout());

        // Text area for displaying output
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane outputScrollPane = new JScrollPane(outputArea);

        // Text field for command input
        JTextField commandField = new JTextField();

        // Button for executing commands
        JButton executeButton = new JButton("Execute");

        // Button for exiting the emulator
        JButton exitButton = new JButton("Exit");

        // Panel for the command input and buttons
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(commandField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(executeButton);
        buttonPanel.add(exitButton);

        inputPanel.add(buttonPanel, BorderLayout.EAST);

        // Add components to the main panel
        panel.add(outputScrollPane, BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.SOUTH);

        // Add main panel to the frame
        frame.add(panel);

        // Action listener for the "Execute" button
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = commandField.getText();
                if (input.isEmpty()) {
                    return;
                }

                if (input.equals("exit")) {
                    JOptionPane.showMessageDialog(frame, "Exiting the emulator...");
                    System.exit(0);
                }

                String output = executor.executeCommand(input);
                fileSystem.logCommand(input, output);

                // Display the output
                outputArea.append(fileSystem.getCurrentDirectory() + "> " + input + "\n");
                outputArea.append(output + "\n");

                // Clear the command field
                commandField.setText("");
            }
        });

        // Action listener for the "Exit" button
        exitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Exiting the emulator...");
            System.exit(0);
        });

        // Show the frame
        frame.setVisible(true);
    }
}
