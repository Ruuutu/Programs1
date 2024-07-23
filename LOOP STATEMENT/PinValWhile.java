//Pin Validation using while
import java.util.Scanner;
class PinValWhile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int attempt=0;
        int pass=12345;
        while(attempt<4)
        {
            System.out.println("Enter the pin: ");
            int pin=sc.nextInt();
        
            if(pass==pin)
            {
                 System.out.println("Logged in successfully !");
                break;
            }
            else
            {
                System.out.println("Invalid Password...Try again!");
                attempt++;
            }
            
            
        }

        if(attempt==4)
        {
            System.out.println("Ooops...!You reached maximum attempt");
        }
      
    }
}