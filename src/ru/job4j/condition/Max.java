package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public double max(double firth, double second) {
        return (firth > second) ? firth : second;
    }

    public double max(double firth, double second, double third) {
        return max(max(firth, second), third);
    }

    public double max(double firth, double second, double third, double fourth) {
        return max(max(firth, second), max(third, fourth));
    }

    public static void main(String[] args) {
        Max m = new Max();
        System.out.println(m.max(5, 10, 50, 100));
    }
}
