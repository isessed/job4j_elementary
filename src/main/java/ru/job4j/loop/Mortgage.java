package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double remainingAmount = amount;
        while (remainingAmount > 0) {
            remainingAmount += remainingAmount * percent / 100;
            remainingAmount -= salary;
            year++;
        }
        return year;
    }
}
