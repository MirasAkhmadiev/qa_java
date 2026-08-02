import com.example.Lion;
import com.example.LionCapabilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Lion {

    @Mock
    LionCapabilities lionCapabilities; // создали мок
    boolean hasMane;

    public Lion(String sex, LionCapabilities lionCapabilities) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.lionCapabilities = lionCapabilities;
    }


    @Test
    public int getKittens() {
        return getKittens(5);
    }
    lion.getKittens();
    public void test() {
         lion.getKittens(5); // вызвали метод объекта с аргументом
        Mockito.verify(lion).getKittens(5); // проверили, что метод вызван с этим параметром
    }
}
