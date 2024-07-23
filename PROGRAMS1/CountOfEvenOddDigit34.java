import java.util.Scanner;
class CountOfEvenOddDigit34
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num");
		int num= sc.nextInt();
		int evenCount=0;
		int oddCount=0;

		while(num>0)
		{
		 int rem= num% 10;
		 if(rem%2==0)
			{
		      evenCount++;
		   }
		   else
			{
			   oddCount++;
			}

		  num/=10;
		}
		System.out.println("count of even digits in the is "+ ""+evenCount);
		System.out.println("count of odd digits in the  is "+""+oddCount);

	}
}
