package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "It puts me in a deadlock. Ask another question";

        System.out.println("Hello, I'm a dummy bot");
        if (question.equals("Hello, Bot")) {
            result = "Hey, smart guy =)";
        } else if (question.equals("Bye")) {
           result = "See you soon!";
        }
        return result;
    }

    public static void main(String[] args) {
        String rslHello = DummyBot.answer("Hello, Bot");
        System.out.println(rslHello);
        String rslBye = DummyBot.answer("Bye");
        System.out.println(rslBye);

        int a = 3;
        int b = 2;
        int c = 5;

        if (a >= b && c <= a) {
            System.out.println("a = " + a);
        } else if (b >= a && c <= b) {
            System.out.println("b = " + b);
        } else {
            System.out.println("c = " + c);
        }
    }
}
