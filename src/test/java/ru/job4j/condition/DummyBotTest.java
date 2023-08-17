package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertEquals(expected, result);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertEquals(expected, result);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus two";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question";
        assertEquals(expected, result);
    }
}