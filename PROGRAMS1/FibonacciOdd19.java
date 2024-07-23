//Code for odd fibonacci
//Factorial
import java.util.Scanner;
class FibonacciOdd19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        int num= sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.println("Fibonaci Seris is only with odd number upto number " + num+"is :");
        for (int i=0;i<num;i++)
        {
           
             if(n1%2!=0)
             {
                System.out.println(n1);
             }
              n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}