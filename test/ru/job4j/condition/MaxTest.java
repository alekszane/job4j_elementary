package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int rls = Max.max(1, 2);
        assertThat(rls, is(2));
    }

    @Test
    public void whenMax1To8Then5() {
        int rls = Max.max(8, 5);
        assertThat(rls, is(8));
    }

    @Test
    public void whenMax1To5Then5() {
        int rls = Max.max(5, 5);
        assertThat(rls, is(5));
    }

    @Test
    public void whenAddTwoParam() {
        Max max = new Max();
        double rsl = max.add(2.0, 2.0);
        assertThat(rsl, closeTo(4, 0.1));
    }

    @Test
    public void whenAddThreeParam() {
        Max max = new Max();
        double rsl = max.add(5.0, 5.0, 10.0);
        assertThat(rsl, closeTo(20, 0.1));
    }
}