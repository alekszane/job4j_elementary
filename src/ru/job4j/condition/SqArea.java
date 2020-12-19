package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1.0)); //Height
        double l = h * k; //Lenght
        return l * h; // square
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(24, 5);
        System.out.println(" p = 24, k = 5, s = 20, real = " + result1);
    }
}
