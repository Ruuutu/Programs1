import java.util.Scanner;
class SumOfCubeOfDigits36
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");//123
		int num= sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			int pow=1;
			for(int i=0;i<3;i++)
			{
			pow*=rem;
			
			}

			sum+=pow;
			num/=10;

		}
		System.out.println("Sum of cube of digits is "+sum);
	}
}
