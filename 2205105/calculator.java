import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter a number");
       int a=obj.nextInt();
       System.out.println("Enter b number");
       int b=obj.nextInt();
       System.out.println("Enter an Operator");
       char op=obj.next().charAt(0);
       switch(op){
        case'+':
        System.out.println(a+b);
        break;
        case'-':
        System.out.println(a-b);
        break;
        case'*':
        System.out.println(a*b);
        break;
        case'/':
        System.out.println(a/b);
        break;

       }
    }
}