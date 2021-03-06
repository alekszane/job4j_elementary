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

    public static char[] extractDiagonal(char[][] board) {
        char[] rls = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rls[i] = board[i][i];
        }
        return rls;
    }

    public static boolean isWin(char[][] board) {
        boolean rls = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    rls = true;
                    break;
                }
            }
        }
        return rls;
    }
}
