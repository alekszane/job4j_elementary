package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int sourse, int dest) {
        int temp = array[sourse];
        array[sourse] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1]; // Last element array [index] = [array.length - 1], else ArrayIndexOutOfBoundsException.
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}