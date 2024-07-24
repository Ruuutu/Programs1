//To check whether given num is palindroming prime or not
import java.util.Scanner;
class ToCheckPalindromingPrime 
{
  public static void main(String[] args)
	  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int reverse=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			int rem=i%10;
			reverse=(reverse*10)+rem;
           
		}
		System.out.println(reverse);
		if(reverse==num)
		{
			int den=2;
			for(;den<num;den++)
			{
				if(reverse%den==0)
				{
				  break;
				}
			}
			if(den==num)
			{
              System.out.println(num+" is a palindroming prime number");			
 			}
			else
			{
			  System.out.println(num+" is not a palindroming prime number");
			}
        }

		else
		{
		  System.out.println(num+" is not a palindroming prime number");
		}
	}
}
