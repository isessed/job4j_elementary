package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        for (int i = source; i < dest; i++) {
            int temp = array[i];
            array[i] = array[dest - i];
            array[dest - i] = temp;
        }
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
    }
}
