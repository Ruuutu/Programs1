//Print sum of factors of given number is equal to number itself
import java.util.Scanner;
class SumFactorsEqNum17
{
	public static void main( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum =0;

		for(int i = 1 ;i < num ;i++)
		{
			if(num%i==0)
			{
			  sum = sum + i;
				
			}
		}

		if(sum==num)
		{
			System.out.println("Sum of factors is equal to num");
		}
		else
		{
			System.out.println("Sum of factors is not equal to num");
		}
	}
}




