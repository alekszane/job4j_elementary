package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rls = (left > right) ? left : right;
        return rls;
    }

    public double add(double firt, double second) {
        return firt + second;
    }

    public double add(double firt, double second, double third) {
        return add(firt, (second + third));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(5, 5));
    }
}
