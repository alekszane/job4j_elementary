package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean rls = false;
        if (year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) {
            rls = true;
        }
        return rls;
    }

    public static void main(String[] args) {
        boolean b = checkYear(2019);
        System.out.println(b);
        b = checkYear(1800);
        System.out.println(b);
        b = checkYear(2020);
        System.out.println(b);
        b = checkYear(2000);
        System.out.println(b);
    }
}
