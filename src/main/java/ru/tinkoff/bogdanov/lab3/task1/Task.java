package ru.tinkoff.bogdanov.lab3.task1;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Task task = new Task();
        System.out.println("task.withUserInput() = " + task.withUserInput());
    }

    public Double test() {
        var a = 4.0;
        var b = 6.0;
        var c = 7.0;

        return triangleSquare(a,b,c);
    }

    public Double withUserInput() {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A:");
        a = getDouble(scanner);
        System.out.println("Enter B:");
        b = getDouble(scanner);
        System.out.println("Enter C:");
        c = getDouble(scanner);

        return triangleSquare(a,b,c);
    }

    public Double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
        };
        return scanner.nextDouble();
    }

    public Double halfPerimeter(Double x, Double y, Double z) {
        return (x + y + z)/2;
    }

    public Double triangleSquare(Double x, Double y, Double z) {
        var p = halfPerimeter(x,y,z);
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }

}
