package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to00then2() {
        int expected = 1;
        Point one = new Point(1, 0);
        Point two = new Point(2, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when103to89then2() {
        int expected = 6;
        Point one = new Point(10, 3);
        Point two = new Point(8, 9);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.4);
    }
}