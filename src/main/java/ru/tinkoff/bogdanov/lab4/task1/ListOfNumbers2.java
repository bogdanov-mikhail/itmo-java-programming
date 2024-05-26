package ru.tinkoff.bogdanov.lab4.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class ListOfNumbers2 {

    private static final String FILE_PATH = "/Users/mi.bogdanov/IdeaProjects/itmo-java-programming/src/main/resources/input-numbers.txt";

    private final List<Integer> arr;
    private static final int SIZE = 10;

    public ListOfNumbers2() {
        arr = new ArrayList<>(SIZE);
    }

    public void readList(){
        try (BufferedReader fr = new BufferedReader(new FileReader(FILE_PATH))) {
          var line = fr.readLine();
          var i = 0;

          while (line != null && !line.isBlank() && i < SIZE) {
              var number = Integer.valueOf(line);
              arr.add(number);
              i++;

              System.out.println("Read " + number);
              line = fr.readLine();
          }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }


    public void writeList() {
        try (PrintWriter out = new PrintWriter(new FileWriter("./numbers.txt"))) {
            for (int i = 0; i < arr.size(); i++) {
                out.println("Value at: " + i + " = " + arr.get(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        var lon = new ListOfNumbers2();

        lon.readList();
        lon.writeList();
    }
}

