//Print sum of factors of given number
import java.util.Scanner;
class SumFactors16
{
	public static void main( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum =0;

		for(int i = 1 ;i <= num ;i++)
		{
			if(num%i==0)
			{
			  sum = sum + i;
				
			}
		}

		System.out.println(sum);
	}
}




