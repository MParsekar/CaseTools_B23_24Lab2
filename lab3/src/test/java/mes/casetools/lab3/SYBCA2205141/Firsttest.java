package mes.casetools.lab3.SYBCA2205141;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Firsttest {
    @Test
    public void test1(){
        Calculator calculator =new Calculator();
        int sum = calculator.add(2, 1);
        assertEquals(3, sum);
        
    }

}
