package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] arr) {
        int rls = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rls += arr[i][j];
            }
        }
        return rls;
    }
}
