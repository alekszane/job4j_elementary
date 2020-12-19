package ru.job4j.condition;

import org.junit.Test;
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
}