package mes.casetools.lab3.Restcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CalculatorController {//Bean : Object created without initialisation
    @GetMapping("add")
    public int getMethodName(@RequestParam int a, @RequestParam int b) {
        
        Caluclator student = new Caluclator(a, b);

        
        return student.add();
    }
    
}
