package ru.job4j.converter;

import org.jetbrains.annotations.Contract;

public class Converter {

    private static int rubleToEvro(int value) {
        return value / 89;
    }

    private static int rubleToDollar(int value) {
        return value / 73;
    }

    public static void main(String[] args) {

        int dollar =  Converter.rubleToDollar(500);
        int euro = Converter.rubleToEvro(500);
        System.out.println("120 rubles are = " + dollar + " dollars");
        System.out.println("120 rubles are = " + euro + " euro");
    }
}
