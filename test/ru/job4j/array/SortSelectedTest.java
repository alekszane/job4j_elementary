package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortDataFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortDataThree() {
        int[] input = new int[] {12, 10, 13};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 12, 13};
        assertThat(result, is(expect));
    }

}