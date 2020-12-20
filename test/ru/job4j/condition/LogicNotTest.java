package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void when4ThenTrue() {
       boolean rls = LogicNot.isEven(4);
        assertThat(rls, is(true));
    }

    @Test
    public void when1ThenTrue() {
        boolean rls = LogicNot.isPossible(1);
        assertThat(rls, is(true));
    }

    @Test
    public void whenNotPossibleTrue() {
        boolean rls = LogicNot.notPossible(-1);
        assertThat(rls, is(true));
    }

    @Test
    public void whenNotEvenTrue() {
        boolean rls = LogicNot.notEven(-11);
        assertThat(rls, is(true));
    }

    @Test
    public void notEvenAndNotPossible() {
        boolean rls = LogicNot.notEvenAndNotPossible(11);
        assertThat(rls, is(true));
    }

    @Test
    public void evenOrNotPosible() {
        boolean rls = LogicNot.evenOrNotPosible(-11);
        assertThat(rls, is(true));
    }
}