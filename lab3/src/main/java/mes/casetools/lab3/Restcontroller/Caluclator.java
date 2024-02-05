package mes.casetools.lab3.Restcontroller;

import lombok.Getter;
import lombok.Setter;
import mes.casetools.lab3.DTO.Student;

@Getter
@Setter // <-Annotation : It gives meaning to anything on which it is defined.
public class Caluclator {
    int a;
    int b;

    public Caluclator(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public void student(String okString) {
        Student ssStudent = new Student();
        ssStudent.setClas("SYBCA"); 
        ssStudent.setName("TestStudent"); 
        ssStudent.setRollNo("TestRoll1"); 
    
        System.out.println(ssStudent.toString());
    }

}
