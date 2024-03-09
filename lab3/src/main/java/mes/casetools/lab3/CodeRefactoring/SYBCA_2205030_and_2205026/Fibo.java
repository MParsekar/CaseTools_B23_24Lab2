package mes.casetools.lab3.CodeRefactoring.SYBCA_2205030_and_2205026;

public class Fibo {
    int a=0;
    int b=1;
    int n=20;
    int i,c;
    void display()
    {
        System.out.println(+a+" ");
        for(i=0;i<n;i++)
        {
            System.out.println(+a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
   
}
