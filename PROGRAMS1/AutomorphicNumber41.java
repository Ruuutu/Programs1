// number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args) 
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
	
		int temp=num;
		 
		for(int i=temp;i!=0;i/=10)
		{
		  count++;
		}

		int square = num * num;
		int den = 1;
		for(int i=0;i<count;i++)
		{
            den*=10;
		  
		}

		if(square%den==num)
		{
		  System.out.println(num + " is an automorphic number"); 
		}
		else
		{
		  System.out.println(num + " is an not automorphic number"); 
		}
	}

}
