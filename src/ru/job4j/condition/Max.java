package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rls = (left > right) ? left : right;
        return rls;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 5));
    }
}