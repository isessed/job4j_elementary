package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j < data.length - 1; j++) {
                int min = MinDiapason.findMin(data, j, data.length - 1);
                int index = FindLoop.indexInRange(data, min, i, data.length - 1);
                int[] swap = SwitchArray.swap(data, j, index);
            }
        }
        return data;
    }
}
