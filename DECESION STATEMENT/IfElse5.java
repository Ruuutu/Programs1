//Largest of two numbers
import java.util.Scanner;
class IfElse5
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=sc.nextInt();
        System.out.println("Enter the second number");
        int n2=sc.nextInt();

        if(n1>n2)
        {
            System.out.println("The no "+n1 + " is largest number");
        }
        else
        {
            System.out.println("The no "+n1 + " is smallest number");

        }
    }

}
