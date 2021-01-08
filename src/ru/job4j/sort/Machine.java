package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int diffirence = money - price;
        int[] rsl = new int[100];
        int size = 0;

        if (diffirence == 0) {
            rsl[0] = 0;
        }
            for (int i = 0; i < coins.length; i++) {
                while (diffirence > 0) {
                    rsl[i] = coins[i];
                    diffirence = diffirence - coins[i];
                    size++;
                    if (diffirence < coins[i]) {
                        break;
                    }
                }
            }
        return Arrays.copyOf(rsl, size);
    }
}
