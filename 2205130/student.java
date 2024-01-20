public class Student {
    String name;
    int rollno;
    int age;

    public Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ichigo", 20, 19);
        Student s2 = new Student("Gojo", 30, 20);
        Student s3 = new Student("Itadori", 40, 18);

        System.out.println("Student Name: " + s1.name + "Rollno:" + s1.rollno + "Age:" + s1.age);
         System.out.println("Student Name: " + s2.name + "Rollno:" + s2.rollno + "Age:" + s2.age);
          System.out.println("Student Name: " + s3.name + "Rollno:" + s3.rollno + "Age:" + s3.age);
}
