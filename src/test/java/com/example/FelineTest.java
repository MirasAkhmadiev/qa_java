package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    public void shouldReturnFelineFamily() {
        // Arrange: подготавливаем данные
        Feline feline = new Feline();
        // Act: вызываем тестируемый метод
        String actualFamily = feline.getFamily(); // Получаем фактическое
        // Assert: проверяем результат
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void shouldReturnKittensCount() {
        // Arrange: подготавливаем данные
        Feline feline = new Feline();
        // Act: вызываем тестируемый метод
        int actualKittensCount = feline.getKittens(); // Получаем фактическое
        // Assert: проверяем результат
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void shouldReturnListOfFood() throws Exception {
        // Arrange: подготавливаем данные
        Feline feline = new Feline();
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        // Act: вызываем тестируемый метод
        List<String> actualListOfFood = feline.eatMeat(); // Получаем фактическое
        // Assert: проверяем результат
        assertEquals(expectedListOfFood, actualListOfFood);
    }
}
