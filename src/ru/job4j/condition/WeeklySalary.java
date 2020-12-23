package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rls = 0;
        int count = 0;
        for (int i: hours) {
            if (i <= 8 && count <= 4 && i != 0) {
                rls = rls + (i * 10);
            }
            if (i != 0 && i > 8 && i <= 12 && count <= 4) {
                rls = rls + (80 + (i - 8) * 15);
            }
            if (i <= 8 && count >= 5 && i != 0) {
                rls = rls + (i * 20);
            }
            if (i > 8 && i <= 12 && count >= 5 && i != 0) {
                rls = rls + (160 + (i - 8) * 30);
            }
            count++;
        }
        return rls;
    }
}
