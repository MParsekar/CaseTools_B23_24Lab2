public class Student{
    String name;
    int age;
    int rollno;

    public Student (String name, int age, int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
    public static void main(String[] args){
        Student student1= new Student("kalpana",20,2205142);
        Student student2= new Student("sharan",21,2205136);
        Student student3= new Student("shyna",22,2205125);
    
    System.out.println("Student name:"+ student1.name+ "age:"+ student1.age+ "rollno:"+ student1.rollno);
    System.out.println("Student name:"+ student2.name+ "age:"+ student2.age+"rollno:"+ student2.rollno);
    System.out.println("Student name:"+ student3.name+ "age:"+ student3.age+"rollno:"+ student3.rollno);
}
}