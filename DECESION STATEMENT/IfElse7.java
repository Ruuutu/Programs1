//Absolute number
import java.util.Scanner;
class IfElse7
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num<0)
        {
            num=-(num);
            System.out.println("Absolute no is "+num);
        }
        else{
            System.out.println("Absolute no is "+num);
        }


      
    }
}