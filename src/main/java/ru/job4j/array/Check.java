package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == data[0]) {
                result = true;
            } else if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
