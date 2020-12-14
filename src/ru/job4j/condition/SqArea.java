package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1.0)); //Height
        double l = h * k; //Lenght
        return l * h; // square
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 1, s = 2, real = " + result1);
    }
}
