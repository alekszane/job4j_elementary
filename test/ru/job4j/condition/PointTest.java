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
    public void when10to00then1() {
        int expected = 1;
        Point one = new Point(1, 0);
        Point two = new Point(2, 0);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when103to89then6() {
        int expected = 6;
        Point one = new Point(10, 3);
        Point two = new Point(8, 9);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.4);
    }

    @Test
    public void when1032to892then6() {
        double expected = 6.320;
        Point one = new Point(10, 3, 2);
        Point two = new Point(8, 9, 2);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when105to002then1() {
        double expected = 3.162;
        Point one = new Point(1, 0, 5);
        Point two = new Point(2, 0, 2);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when001to002then1() {
        double expected = 1.0;
        Point one = new Point(0, 0, 2);
        Point two = new Point(0, 0, 1);
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}