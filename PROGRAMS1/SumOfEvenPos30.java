//to check sum of even position of given number
import java.util.Scanner;
class SumOfEvenPos30
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//12345
		int num = sc.nextInt();
		int sum = 0;
		int count=0;
		int temp = num;
	
	    while(temp>0)
		{
		  temp/=10;
		 count++;
		}

		 while(count>0)
		 {
			 int rem = num % 10;
			 if (count % 2 == 0)
			 {
				 sum = sum + rem;
			 }
			 num/=10;
			 count--;

		 }
		System.out.println("Sum of even positions digits of given number is "+sum);
		

	}
}