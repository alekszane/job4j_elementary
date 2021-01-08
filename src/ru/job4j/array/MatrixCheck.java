package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rls = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                rls = false;
                break;
            }
        }
        return rls;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
