//to check sum of even position  and sum odd position of given number are same
import java.util.Scanner;
class SumOfEvenSumOddPos31
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//12345
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		int product=1;
		int pos=1;
		while(num>0)
		{
		  int rem= num % 10;
		  if (pos%2==0)
		  {
			 evenSum= evenSum + rem;
		  }
		  else
		   {
			  oddSum=oddSum + rem;
		   }
		  pos++;
		 num/=10;
		
		}
		if(evenSum== oddSum)
		{
		System.out.println("Sum of even positions and odd position is same");
		}
		else
		{
		System.out.println("Sum of even positions and odd position is not same");
		}
		

	}
}