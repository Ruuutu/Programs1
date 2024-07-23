//Duck Number (If given number contains 0 in it
import java.util.Scanner;
class DuckNumber28
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");//0123
		int num = sc.nextInt();
		for(int i=0;i<=num+1;i++)
		{
		  int rem= num % 10;
		  if (rem==0)
		  {
			  System.out.println("Given number is duck number");
			  break;
		  }
		 num/=10;

		 if(num==0)
			{
		     System.out.println("Given number is NOT duck number");
			}
		}
		

	}
}
