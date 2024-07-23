//A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.
import java.util.Scanner;
class NeonNumber43 
{
	public static void main(String[] args) 
	{    
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int square=num*num;
		int sum=0;
		for(int i=square;i!=0;i/=10)
		{
		  int rem= i%10;
		  sum+=rem;
		}

		if(num==sum)
		{
		  System.out.println(num+" is a NEON NUMBER");

		}
		else
		{
		 System.out.println(num+" is not a NEON NUMBER");

		}
	}
}
