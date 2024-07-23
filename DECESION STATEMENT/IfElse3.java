//Check whether entered char is vowel pr consonent
import java.util.Scanner;

class IfElse3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char:");
        char ip=sc.next().charAt(0);

        if((ip>='a' && ip<='z') || (ip>='A' && ip<='Z'))
        {
           if(ip=='a' || ip=='e' || ip=='i' || ip=='o' || ip=='u' ||ip== 'A' || ip=='E' || ip=='I' || ip=='O' || ip=='U')
              {
                System.out.println("It is an vowel");
              }

            else
            {
                System.out.println("It is consonent");
            }
        }
        else
        {
            System.out.println("It is not alphabet");
        }
    }
}
    
