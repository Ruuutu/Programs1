//Check for ugly number
//positive integer whose prime factors are limited to 2 , 3 , and 5
import java.util.Scanner;
class UglyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num!=0)
		{
			if (num%2==0)
			{
				num/=2;
			}

			else if (num%3==0)
			{
				num/=3;
			}

			else if (num%5==0)
			{
				num/=5;
			}
			else{break;}

		
		}
		if(num==1)
		{
		 System.out.println("Ugly");
		}
		else
		{
		 System.out.println("Beautiful");
		}
	}
}
