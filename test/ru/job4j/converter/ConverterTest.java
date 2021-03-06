package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConverter500RubThen5Euro() {
        int in = 500;
        int expected = 5;
        int out = Converter.rubleToEvro(500);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConverter500RubThen6Dlr() {
        int in = 500;
        int expected = 6;
        int out = Converter.rubleToDollar(500);
        Assert.assertEquals(expected, out);
    }
}