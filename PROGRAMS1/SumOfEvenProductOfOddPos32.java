//to check sum of even position  and product of odd position of given number
import java.util.Scanner;
class SumOfEvenProductOfOddPos32
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//12345
		int num = sc.nextInt();
		int sum = 0;
		int pos=1;
		int product=1;
		while(num>0)
		{
		  int rem= num % 10;
		  if (pos%2==0)
		  {
			  sum= sum + rem;
		  }
		  else
			{
			  product=product * rem;
		   }
		  pos++;
		 num/=10;

		
		}
		System.out.println("Sum of even positions digits of given number is "+sum+" And product of odd position digit is  "+product);
		

	}
}