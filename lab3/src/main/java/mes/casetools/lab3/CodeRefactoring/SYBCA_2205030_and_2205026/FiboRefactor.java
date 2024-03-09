package mes.casetools.lab3.CodeRefactoring.SYBCA_2205030_and_2205026;

public class FiboRefactor {
    int first_num=0;
    int second_num=1;
    int Limit=20;
    int index,third_num;

    void display()
    {
        System.out.println(+first_num+" ");
        for(index=0;index<this.Limit;index++)
        {
            System.out.println(+first_num+" ");
            first_num=second_num;
            second_num=third_num;
            third_num=first_num+second_num;
        }
    }

}
