package ru.tinkoff.bogdanov.lab3.task2;

public class Task {

    public static void main(String[] args) {
        var task1 = new ru.tinkoff.bogdanov.lab3.task1.Task();
        System.out.printf("Площадь - %.2f", task1.withUserInput());

        var a = 1.0;
        var b = 2.0;
        var c = 3.0;
        var r = task1.triangleSquare(a, b, c);
        System.out.printf("Периметр %.2f, %.2f и %.2f == %.2f", a, b, c, r);
    }
}
