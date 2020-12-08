package ru.job4j.calculator;

public class Fit {
    private static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    private static double womanWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static void main(String[] args) {
        short height = 165;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 165 is " + man);
        System.out.println("Woman 165 is " + man);
    }
}
