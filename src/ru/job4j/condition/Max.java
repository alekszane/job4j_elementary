package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rls = (left > right) ? left : right;
        return rls;
    }

    public double max(double firt, double second) {
        double rls = (firt > second) ? firt : second;
        return rls;
    }

    public double max(double firt, double second, double third) {
        double maxFirst = max(firt, second);
        double rsl = (maxFirst > third) ? maxFirst : third;
        return rsl;
    }

    public double max(double firt, double second, double third, double fourth) {
        double maxFirst = max(firt, second);
        double maxSecond = max(third, fourth);
        double rsl = (maxFirst > maxSecond) ? maxFirst : maxSecond;
        return rsl;
    }

    public static void main(String[] args) {
        Max m = new Max();
        System.out.println(m.max(5, 10, 50, 100));
    }
}
