package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void firstMax() {
        int rsl = MultiMax.max(10, 5, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void secondMax() {
        int rsl = MultiMax.max(10, 50, 1);
        assertThat(rsl, is(50));
    }

    @Test
    public void thirdMax() {
        int rsl = MultiMax.max(1, 5, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void allEq() {
        int rsl = MultiMax.max(1, 1, 1);
        assertThat(rsl, is(1));
    }

    @Test
    public void firstEqSecond() {
        int rsl = MultiMax.max(10, 10, 1);
        assertThat(rsl, is(10));
    }

    @Test
    public void firstEqThird() {
        int rsl = MultiMax.max(100, 1, 100);
        assertThat(rsl, is(100));
    }

    @Test
    public void secondEqThird() {
        int rsl = MultiMax.max(1, 100, 100);
        assertThat(rsl, is(100));
    }
}