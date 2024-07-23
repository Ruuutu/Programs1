//To print Even Factors
import java.util.Scanner;
class EvenFactors15

{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = sc.nextInt();

		for(int i = 1 ;i <= num ;i++)
		{
			if(num%i==0)
			{
				if(i%2==0)
				{
				 System.out.println(i);
				}
			
			}
			

			
		}


	}
}
