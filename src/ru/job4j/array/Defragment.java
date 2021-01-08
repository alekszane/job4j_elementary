package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int j = index; j < array.length ; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;  /* указатель на NotNull ячейку. */
                        array = swap(array, point, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
           String temp = array[nullIndex];
           array[nullIndex] = array[notNullIndex];
           array[notNullIndex] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}
