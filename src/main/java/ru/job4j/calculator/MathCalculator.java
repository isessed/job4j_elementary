package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета сложения суммы и умножения двух чисел : " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления двух чисел: " + subtractAndDivide(10, 20));
        System.out.println("Результат расчета суммы вычисления всех операций: " + sumAllOperations(10, 20));
    }
}
