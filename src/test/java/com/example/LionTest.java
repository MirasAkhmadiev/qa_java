package com.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.function.Executable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    LionCapabilities lionCapabilities; // создали мок

    @Test
    public void shouldReturnKittensCount() throws Exception {
        Lion lion = new Lion("Самец", lionCapabilities);
        Mockito.when((lionCapabilities).getKittens()).thenReturn(5);
        int actualResult = lion.getKittens();
        assertEquals(5, actualResult);
    }

    @Test
    public void shouldReturnListOfFood() throws Exception {
        Lion lion = new Lion("Самец", lionCapabilities);
        List<String> expectedResult = List.of("Красное мясо", "Белое мясо");
        Mockito.when((lionCapabilities).getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Создание льва с некорректным полом вызывает исключение Exception")
    public void incorrectSexThrowsException() {
        Executable executable = () -> new Lion(" ", lionCapabilities);
        assertThrows(Exception.class, executable);
    }
}
