//To check whether given character is alphabet or not
import java.util.Scanner;
class IfElse2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char:");
        char ip=sc.next().charAt(0);

        if((ip>='a' && ip<='z') || (ip>='A' && ip<='Z'))
        {
            System.out.println("it is an alpbhabet");
        }
        else
        {
            System.out.println("It is not alphabet");
        }
    }
}