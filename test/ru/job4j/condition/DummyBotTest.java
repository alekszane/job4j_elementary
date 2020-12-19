package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Hello, Bot"),
                is("Hey, smart guy =)")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Bye"),
                is("See you soon!")
        );
    }

    @Test
    public void whenAnotherQuestion() {
        assertThat(
                DummyBot.answer("What do you know?"),
                is("It puts me in a deadlock. Ask another question")
        );
    }
}