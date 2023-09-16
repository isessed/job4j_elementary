package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when012To345Then5Dot19() {
        Point a = new Point(0, 1, 2);
        Point b = new Point(3, 4, 5);
        double expected = 5.19;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when678To234Then6Dot92() {
        Point a = new Point(6, 7, 8);
        Point b = new Point(2, 3, 4);
        double expected = 6.92;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when01To21Then2() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 1);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when32To24Then2Dot23() {
        Point a = new Point(3, 2);
        Point b = new Point(2, 4);
        double expected = 2.23;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when41To32Then1Dot41() {
        Point a = new Point(4, 1);
        Point b = new Point(3, 2);
        double expected = 1.41;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}