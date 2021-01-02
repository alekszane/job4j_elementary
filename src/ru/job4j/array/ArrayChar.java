package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] words, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (words[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return  result;
    }
}
