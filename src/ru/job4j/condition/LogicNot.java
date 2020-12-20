package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPossible(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPossible(int num) {
        return !isPossible(num);
    }

    public static boolean notEvenAndNotPossible(int num) {
        return isPossible(num) && notEven(num);
    }

    public static boolean evenOrNotPosible(int num) {
        return isEven(num) || notPossible(num);
    }
}
