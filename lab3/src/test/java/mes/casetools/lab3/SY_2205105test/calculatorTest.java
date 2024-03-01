package mes.casetools.lab3.SY_2205105test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.SYBCA2205105.calculator;

@SpringBootTest
public class calculatorTest {
    @Test
    void contextLoads(){

    }

    @Test
    void assertadd(){
        calculator calculator=new calculator();
        int ans=calculator.add(5,3);
        assertEquals(8, ans);
    }
    
}
