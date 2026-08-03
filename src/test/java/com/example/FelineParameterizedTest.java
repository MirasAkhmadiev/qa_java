package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 0, -1})
    public void shouldReturnKittensCountWithParameter(int count) {
        Feline feline = new Feline();
        int expected = count;
        int actual = feline.getKittens(count);
        assertEquals(expected, actual);
    }
}
