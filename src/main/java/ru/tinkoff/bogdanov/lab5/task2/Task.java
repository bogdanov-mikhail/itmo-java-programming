package ru.tinkoff.bogdanov.lab5.task2;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        var date = Date.dateOf(8, 5, 2024);
        System.out.println(date.displayDate());
    }
}

record Date(
        int day,
        int month,
        int year
) {

    public String displayDate() {
        return Month.getMonthByNumber(month).name();
    }

    public static Date dateOf(int day, int month, int year) {
        var monthEnum = Month.getMonthByNumber(month);
        return dateOf(day, monthEnum, year);
    }

    public static Date dateOf(int day, Month month, int year) {
        var isLeapYear = isLeapYear(year);
        var additionalLeapDeap = 0;

        if (isLeapYear || month == Month.FEBRUARY) {
            additionalLeapDeap = 1;
        }

        if (day < 0 || day > month.getDays() + additionalLeapDeap) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }

        if (year < 1) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }

        return new Date(day, month.ordinal() + 1, year);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public enum Month {
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }

        public static Month getMonthByNumber(int monthNumber) {
            return switch (monthNumber) {
                case 1 -> JANUARY;
                case 2 -> FEBRUARY;
                case 3 -> MARCH;
                case 4 -> APRIL;
                case 5 -> MAY;
                case 6 -> JUNE;
                case 7 -> JULY;
                case 8 -> AUGUST;
                case 9 -> SEPTEMBER;
                case 10 -> OCTOBER;
                case 11 -> NOVEMBER;
                case 12 -> DECEMBER;
                default -> throw new IllegalArgumentException("Invalid month number");
            };
        }
    }


}
