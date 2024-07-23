import java.util.Scanner;
class SumOfEvenPos2
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//123456
		int num = sc.nextInt();
		int sum = 0;
		int pos=1;
		int temp = num;
	    while(temp>0)
		{
		  temp /= 10;
		  pos++;
		}
	    pos = pos - 1;
	    temp = num;
	    while(temp>0)
		{
		  int rem= temp % 10;
		  temp /= 10;
		  if (pos%2==0)
		  {
			  sum= sum + rem;
		  }
		  pos--;
		
		}
		System.out.println("Sum of even positions digits of given number is "+sum);
		

	}
}