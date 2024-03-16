package sanath;
import java.util.Scanner;
class Simple
{
    String name;
    int roll_no;
    string email;
    double S1,S2,S3,S4,total,percent;
    void get_Info()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name: "); 
        name=obj.next();

        System.out.print("Enter Roll Number: "); 
        roll_no=obj.nextInt();

        System.out.print("Enter English: "); 
        S1=obj.nextDouble();
        
        System.out.print("Enter Maths: "); 
        S2=obj.nextDouble();

        System.out.print("Enter Science: "); 
        S3=obj.nextDouble();

        System.out.print("Enter Hindi: "); 
        S4=obj.nextDouble();
    }

    void Cal()
    {
        total = S1+S2+S3+S4;
        percent=(total/400)*100;
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll_no);
        System.out.println("English: "+S1);
        System.out.println("Maths: "+S2);
        System.out.println("Science: "+S3);
        System.out.println("Hindi: "+S4);
        System.out.println("Total Marks Of 4 Subject: "+total+"/400");
        System.out.println("Percentage: "+percent);
    }
}

public class Simp_Main
{
    public static void main(String[] args)
    {
        Simple obj1 = new Simple();
        obj1.get_Info();
        obj1.Cal();
        obj1.display();
    }
}