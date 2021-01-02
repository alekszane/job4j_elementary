package ru.job4j.array;

public class Min {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int index : arr) {
            if (index < min) {
                min = index;
            }
        }
        return min;
    }
}
