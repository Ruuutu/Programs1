//Buzz number is another special number in Java that ends with digit 7 or divisible by 7.
import java.util.Scanner;
class BuzzNumber42 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%7==0 || num%10==7)
		{
		 System.out.println(num+" is a BUZZ number");
		}
		else
		{
		 System.out.println(num+" is NOT BUZZ number");
		}


	}
}
