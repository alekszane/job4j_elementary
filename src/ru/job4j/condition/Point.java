package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double powX = Math.pow(x1 - x2, 2);
        double powY = Math.pow(y1 - y2, 2);
        return Math.sqrt(powX + powY);
    }

    public static void main(String[] args) {
        double result = Point.distance(10, 3, 8, 9);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
