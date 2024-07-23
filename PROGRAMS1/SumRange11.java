//Sum of all digits between given range
import java.util.Scanner;
class SumRange11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the start");
			int start = sc.nextInt();

			System.out.println("Enter the end");
			int end = sc.nextInt();
			
			int sum =0;

			/*for (int i =start;i<=end ;i++ )
			{
				sum=sum+i;
			}
			*/
			while(start<=end)
			{
				sum = sum + start;
				start++;
			}

			System.out.println(sum);

		}

	}
}


