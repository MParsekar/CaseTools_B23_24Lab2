public class FiboRefactor {
    int first_num=0;
    int second_num=1;
    int Limit=20;
    int index,third_num;
    void display()
    {
        System.out.println(+first_num+" ");
        for(index=0;index<n;index++)
        {
            System.out.println(+first_num+" ");
            first_num=second_num;
            second_num=third_num;
            third_num=first_num+second_num;
        }
    }
    public static void main(String[] args) {
        Fibo obj = new Fibo();
        obj.display();
    }
}
