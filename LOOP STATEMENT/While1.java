//TO PRINT NO BETWEEN GIVEN RANGE USING WHILE LOOP
import java.util.Scanner;
class While1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int first=sc.nextInt();
        System.out.println("Enter the ending number:");
        int last=sc.nextInt();
        if(first<last)
         {
            System.out.println("Ascending Order");
            while(first<=last)
            {
                System.out.println(first);
                first++;
            }
         }
        else
         {
            System.out.println("Descending Order");
            while(first>=last)
            {
                System.out.println(first);
                first--;
            }
         }
        
    }
}