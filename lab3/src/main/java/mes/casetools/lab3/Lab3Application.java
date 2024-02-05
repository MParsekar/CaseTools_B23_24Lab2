package mes.casetools.lab3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
		System.out.println("Hello World ");
		int a = 0;
		int b = 1;
		System.out.println(a + b);
	}

}
