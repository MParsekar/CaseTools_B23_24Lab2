package mes.casetools.lab3.Restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MainController {
    @GetMapping(value="/test")
    public String maString() {
        System.out.println("Hello ");
        return "index";
    }

    
    
}
