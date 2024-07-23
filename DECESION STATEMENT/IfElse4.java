//To check given no is even or odd
import java.util.Scanner;
class IfElse4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("Given no "+ n + " is even"); 
        }
        else
        {
            System.out.println("Given no "+ n + " is odd");
        }
    }
}