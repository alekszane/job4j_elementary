package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckTest {
    @Test
    public void whenCheckReturnTrue() {
        boolean[] input = {true, true, true};
        boolean result = Check.mono(input);
        boolean expected = true;

        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckReturnFalse() {
        boolean[] input = {true, false, true};
        boolean result = Check.mono(input);
        boolean expected = false;

        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckReturnTrueValueFalse() {
        boolean[] input = {false, false, false};
        boolean result = Check.mono(input);
        boolean expected = true;

        assertThat(result, is(expected));
    }
}