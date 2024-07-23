//To check given number is positive or not
import java.util.Scanner;
class IfElse6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }

    }
}