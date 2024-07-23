import java.util.Scanner;
class IfElse81
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the homoglobin level:");
        float hb=sc.nextFloat();
        if(hb>13.0f)
        {
            System.out.println("You can donate the blood");
        }
        else
        {
            System.out.println("You can't donate the blood");
        }
    }
}