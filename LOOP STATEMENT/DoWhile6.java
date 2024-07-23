//Pin Validation using do while
import java.util.Scanner;
class DoWhile6
{
    public static void main(String[] args)
    {
      
        int attempt=0;
        int actual=12345;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the password");
            int pass =sc.nextInt();
            if(pass==actual)
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
        while(attempt<4);

        if(attempt==4)
        {
            System.out.println("Ooops...!You reached maximum attempt");
        }

    }
}