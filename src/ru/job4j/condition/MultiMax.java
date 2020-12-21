package ru.job4j.condition;

public class MultiMax {
    public static  int max(int first, int second, int third) {
        int max = 0;

        if (first > second) {
            max = first;
            if (first > third) {
                max = third;
            } else {
                max = first;
            }
        } else {
           max = second;
            if (second > third) {
                max = second;
            } else {
                max = third;
            }
        }
        return max;
    }
}
