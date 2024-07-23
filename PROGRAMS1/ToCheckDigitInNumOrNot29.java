//To check whether digit is present in number or not
import java.util.Scanner;
class ToCheckDigitInNumOrNot29
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		System.out.println("Enter the digit");//1234
		int digit = sc.nextInt();

		for (int i=0;i<=num+1 ;i++ )
		{
			int rem= num % 10;
			if(rem==digit)
			{
			  System.out.println(digit + " is present in the given num");
			  break;
			}
			  
			num/=10;

			if(num==0)
			{
		     System.out.println(digit + " is not present in the given num");
			}
		}


	}
}
