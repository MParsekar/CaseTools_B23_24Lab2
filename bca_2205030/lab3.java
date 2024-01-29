
public class lab3 {
    String name;
    String rollNo;
    String clas;

    void getData(String name, String rollNo, String clas) {
        this.name = name;
        this.rollNo = rollNo;
        this.clas = clas;
    }

    void display() {
        System.out.println("Name: " + name + "\nRoll Number: " + rollNo + "\nClass: " + clas);
    }
}

class labMain {
    public static void main(String[] args) {
        lab3 obj = new lab3();
        obj.getData("Rajesh", "20", "SYBCA");
        obj.display();
    }
}