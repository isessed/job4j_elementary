package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public int max(int first, int second, int third) {
        int result = max(second, third);
        return max(first, result);
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, second, max(third, fourth));
    }
}
