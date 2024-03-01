package mes.casetools.lab3.SY_2205105test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import mes.casetools.lab3.SYBCA2205105.Product;

@SpringBootTest
public class ProductTest {
    @Test
    void contextLoads(){

    }

    @Test
    void assertprod(){
        Product obj=new Product();
        int ans= obj.prod(5, 5);
        assertEquals(25, ans);
    }
    
}
