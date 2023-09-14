package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import ru.job4j.array.MatrixSum;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    Max max = new Max();

    @Test
    void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = max.max(first, second, third);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = max.max(first, second, third, fourth);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void whenMax3To8Then8() {
        int left = 3;
        int right = 8;
        int result = max.max(left, right);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }
}