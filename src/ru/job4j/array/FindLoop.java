package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result = -1; //If no element in array.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return  result;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; //If no element in array.
        for (int i = 0; i < data.length; i++) {
            if (i >= start && i <= finish) {
                if (data[i] == el) {
                    rst = i;
                    break;
                }
            }
        }
        return rst;
    }
}
