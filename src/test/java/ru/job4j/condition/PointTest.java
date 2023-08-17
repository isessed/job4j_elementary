package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when01To21Then() {
        double expected = 2;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when32To24Then2Dot23() {
        double expected = 2.23;
        int x1 = 3;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void when41To32Then1Dot41() {
        double expected = 1.41;
        int x1 = 4;
        int y1 = 1;
        int x2 = 3;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}