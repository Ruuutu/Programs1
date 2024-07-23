// Check votinf eligibility
import java.util.Scanner;
class IfElse1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if (age>=18)
        {
            System.out.println("Please vote");
        }
        else 
        {
            System.out.println("You can not vote");
        }
    }
}