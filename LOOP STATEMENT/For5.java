//to print table
import java.util.Scanner;
class For5
{
    public static void main(String[] args)
    {   System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int multiplicand=sc.nextInt();
        for(int multiplier=1;multiplier<=10;multiplier++)
        {
            
            System.out.println(multiplicand +"*" + multiplier +"=" +(multiplicand *multiplier));
        }

    }
}
