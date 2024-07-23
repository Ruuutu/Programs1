//Fibonacci
import java.util.Scanner;
class Fibonacci18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num= sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("Fibonaci Seris is upto number " + num+"is :");
        for (int i=0;i<num;i++)
        {
            n3=n1+n2;
            System.out.println(n1);
            n1=n2;
            n2=n3;
        }
    }
}