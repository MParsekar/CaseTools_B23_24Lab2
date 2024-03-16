import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BCA2205130CALCULATOR {
    @Test
    public void test1(){
        BCA2205130CALCULATOR calculator = new BCA2205130CALCULATOR();
        int sum = calculator.add(2, 1);
        assertEquals(3, sum);
    }

}