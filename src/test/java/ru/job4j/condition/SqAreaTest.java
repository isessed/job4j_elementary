package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void whenP3K3Square0Dot42() {
        double expected = 0.42;
        int p = 3;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    void whenP2K5Square0Dot13() {
        double expected = 0.13;
        int p = 2;
        double k = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}