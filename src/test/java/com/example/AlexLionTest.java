package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class AlexLionTest {

    @Mock
    LionCapabilities lionCapabilities;

    @Test
    public void shouldReturnZeroKittens() throws Exception {
        // Arrange: подготавливаем данные
        AlexLion alexLion = new AlexLion(lionCapabilities);
        // Act: вызываем тестируемый метод
        int actual = alexLion.getKittens(); // Получаем фактическое
        // Assert: проверяем результат
        int expected = 0;
        assertEquals(expected, actual);
        Mockito.verify(lionCapabilities, Mockito.times(0)).getKittens();
    }

    @Test
    public void shouldReturnPlaceOfLiving() throws Exception {
        // Arrange: подготавливаем данные
        AlexLion alexLion = new AlexLion(lionCapabilities);
        // Act: вызываем тестируемый метод
        String actual = alexLion.getPlaceOfLiving(); // Получаем фактическое
        // Assert: проверяем результат
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnAlexFriendsNames() throws Exception {
        // Arrange: подготавливаем данные
        AlexLion alexLion = new AlexLion(lionCapabilities);
        List<String> expectedListOfFriends = List.of("Марти", "Глория", "Мелман");
        // Act: вызываем тестируемый метод
        List<String> actualListOfFriends = alexLion.getFriends(); // Получаем фактическое
        // Assert: проверяем результат
        assertEquals(expectedListOfFriends, actualListOfFriends);
    }

    @Test
    public void shouldReturnHasManeTrue() throws Exception {
        AlexLion alexLion = new AlexLion(lionCapabilities);
        boolean actual = alexLion.doesHaveMane();
        assertTrue(actual);
    }

}
