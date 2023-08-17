package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void whenMax3To8Then8() {
        int left = 3;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }
}