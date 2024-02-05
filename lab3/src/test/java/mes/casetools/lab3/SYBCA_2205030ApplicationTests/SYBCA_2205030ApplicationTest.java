package mes.casetools.lab3.SYBCA_2205030ApplicationTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.Professor.Calculator;

@SpringBootTest
public class SYBCA_2205030ApplicationTest {

    @Test
    void contextLoads() {

    }

    @Test
    void assertAdd() {
        Calculator calculator = new Calculator();
        int ans = calculator.add(1, 2);
        assertEquals(3, ans);
    }

}
