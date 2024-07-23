//Code to print nth  fibonacci num
//Factorial
import java.util.Scanner;
class FibonacciNumNth21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num= sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println(" number at pos " + num+" in fibonacci series will be :");
        for (int i=0;i<num-1;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

                System.out.println(n1);

    }
}