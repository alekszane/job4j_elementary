package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rls = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != (int)'X') {
                rls = false;
                break;
            }
        }
        return rls;
    }
}
