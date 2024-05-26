package ru.tinkoff.bogdanov.lab3.task3;

public class Task {

    public static void main(String[] args) {
        var task1 = new ru.tinkoff.bogdanov.lab3.task1.Task();

        var a = 1.0;
        var b = 2.0;
        var c = 3.0;
        var r = task1.triangleSquare(a, b, c);
        String s = "Периметр %.2f, %.2f и %.2f == %.2f".formatted(a, b, c, r) + " \u263A";
        System.out.println(s);
    }
}
