package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean rls = true;
        for (int i = 0; i < post.length; i++) {
          if (word[(word.length - 1) - i] != post[(post.length - 1) - i]) {
              rls = false;
              break;
          }
        }
        return rls;
    }
}