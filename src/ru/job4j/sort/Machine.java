package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int diffirence = money - price;
        int[] rsl = new int[100];
        int size = 0;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= diffirence % coins[i]; j++) {
                while (diffirence >= coins[i]) {
                    rsl[size] = coins[i];
                    diffirence = diffirence - coins[i];
                    size++;
                    j++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
