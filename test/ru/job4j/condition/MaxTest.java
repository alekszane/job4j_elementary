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
    public void whenMaxTwoParam() {
        Max m = new Max();
        double rsl = m.max(2.0, 4.0);
        assertThat(rsl, closeTo(4, 0.1));
    }

    @Test
    public void whenMaxThreeParam() {
        Max m = new Max();
        double rsl = m.max(5.0, 8.0, 10.0);
        assertThat(rsl, closeTo(10, 0.1));
    }

    @Test
    public void whenMaxFourParam() {
        Max m = new Max();
        double rsl = m.max(5.0, 8.0, 10.0, 50.0);
        assertThat(rsl, closeTo(50, 0.1));
    }
}