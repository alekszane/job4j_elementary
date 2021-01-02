package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {2, 4, 6, 8};
        int[] result = Turn.back(input);
        int[] expected = {8, 6, 4, 2};

        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {3, 6, 9, 12, 14};
        int[] result = Turn.back(input);
        int[] expected = {14, 12, 9, 6, 3};

        assertThat(result, is(expected));
    }
}