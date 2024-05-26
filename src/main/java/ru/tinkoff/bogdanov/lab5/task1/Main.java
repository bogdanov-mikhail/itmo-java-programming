package ru.tinkoff.bogdanov.lab5.task1;

public class Main {

    public static void main(String[] args) {
        var a = 10;
        var x = 10;

        int result = 0;
        while (x != 0) {
            if ((x & 0x1) == 0x1) {
                result += a;
            }

            x >>= 1;
            a <<= 1;
        }
        System.out.println(result);
    }
}
