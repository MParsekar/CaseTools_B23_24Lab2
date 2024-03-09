package mes.casetools.lab3.SYBCA2205141;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class calculatorTest {
    @Test
    void contextLoads(){

    }

    @Test
    void assertadd(){
        Calculator obj=new Calculator();
        int ans=obj.add(2,2);
        assertEquals(4, ans);
    }
    
}
