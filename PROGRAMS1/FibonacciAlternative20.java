//Code to print alternative  fibonacci
//Factorial
import java.util.Scanner;
class FibonacciAlternative20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num= sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("Fibonaci Seris is with alternative number upto number " + num+"is :");
        for (int i=0;i<num;i++)
        {
            n3=n1+n2;
             if(i%2==0)
             {
                System.out.println(n1);
             }
            n1=n2;
            n2=n3;
        }
    }
}
// 0 1 1 2 3 5 8 13 21