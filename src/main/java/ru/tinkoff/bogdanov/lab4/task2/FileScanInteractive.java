package ru.tinkoff.bogdanov.lab4.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(-1);
        }

        var filePath = args[0];

        var counter = new FileScanInteractive();
        var scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Enter the search string or q to exit:");
            userInput = scanner.next().trim();

            if (userInput.equals("q")) {
                return;
            }

            try {
                var count = counter.countTokens(filePath, userInput);
                System.out.println("The word " + userInput + " appears " + count + " times in the file.");
            } catch (IOException ex) {
                System.out.println("Exception during search! Try again!");
            }
        } while (true);
    }
}