package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int rls = FindLoop.indexOf(input, value);
        int exp = 0;
        assertThat(rls, is(exp));
    }

    @Test
    public void whenArrayHas13then3() {
        int[] input = {5, 9, 33, 13};
        int value = 13;
        int rls = FindLoop.indexOf(input, value);
        int exp = 3;
        assertThat(rls, is(exp));
    }

    @Test
    public void whenArrayHas3thenMinus1() {
        int[] input = {10, 11, 12, 13};
        int value = 3;
        int rls = FindLoop.indexOf(input, value);
        int exp = -1;
        assertThat(rls, is(exp));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 3;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}