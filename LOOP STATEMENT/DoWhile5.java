//To PRINT TABLE

import java.util.Scanner;
class DoWhile5
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int multiplicand= sc.nextInt();
        int multiplier=1;
        do
        {
            System.out.println(multiplicand +"*" + multiplier +"=" +(multiplicand *multiplier));
            multiplier++;

        }
        while(multiplier<=10);
    
    }
}