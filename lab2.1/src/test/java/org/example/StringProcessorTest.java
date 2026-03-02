package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StringProcessorTest {

    @Test
    public void testCopyString() {
        assertEquals("qqqqqq", StringProcessor.multiply("q", 6));
        assertEquals("", StringProcessor.multiply("qwe", 0));
        assertEquals("", StringProcessor.multiply("", 5));
        assertEquals("hellhell", StringProcessor.multiply("hell", 2));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(3, StringProcessor.contains("good bad good good", "good"));
        assertEquals(3, StringProcessor.contains("qwqwqwq", "qwq"));
        assertEquals(0, StringProcessor.contains("abc", "asd"));
    }

    @Test
    public void testReplaceDigitsWithWords() {
        assertEquals("одиндватри", StringProcessor.newString("123"));
        assertEquals("qодинwдваeтри", StringProcessor.newString("q1w2e3"));
        assertEquals("qwe", StringProcessor.newString("qwe"));
        assertEquals("", StringProcessor.newString(""));

    }

    @Test
    public void testremoveEverySecondChar() {
        StringBuilder w1 = new StringBuilder("qwerty");
        StringProcessor.redactStringBuilder(w1);
        assertEquals("qet", w1.toString());

        StringBuilder w2 = new StringBuilder("35353535");
        StringProcessor.redactStringBuilder(w2);
        assertEquals("3333", w2.toString());

        StringBuilder w3 = new StringBuilder("qw");
        StringProcessor.redactStringBuilder(w3);
        assertEquals("q", w3.toString());

    }

}