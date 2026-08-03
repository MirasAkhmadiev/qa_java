package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void shouldReturnCatSound() {
        // Arrange: подготавливаем данные
        Cat cat = new Cat(feline);
        // Act: вызываем тестируемый метод
        String actualSound = cat.getSound(); // Получаем фактическое
        // Assert: проверяем результат
        String expectedSound = "Мяу";
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void shouldReturnListOfFood() throws Exception {
        // Arrange: подготавливаем данные
        Cat cat = new Cat(feline);
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when((feline).eatMeat()).thenReturn(expectedListOfFood);
        // Act: вызываем тестируемый метод
        List<String> actualListOfFood = cat.getFood(); // Получаем фактическое
        // Assert: проверяем результат
        assertEquals(expectedListOfFood, actualListOfFood);
    }
}
