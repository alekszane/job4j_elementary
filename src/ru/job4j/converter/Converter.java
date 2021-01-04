package ru.job4j.converter;

public class Converter {

    public static int rubleToEvro(int value) {
        return value / 89;
    }

    public static int rubleToDollar(int value) {
        return value / 73;
    }

    public static void main(String[] args) {

        int dollar =  Converter.rubleToDollar(500);
        int euro = Converter.rubleToEvro(500);
        System.out.println("500 rubles are = " + dollar + " dollars");
        System.out.println("500 rubles are = " + euro + " euro");
    }
}
