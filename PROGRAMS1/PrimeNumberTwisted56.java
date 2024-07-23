//Twisted Prime
import java.util.Scanner;
class PrimeNumberTwisted56
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int den=2;
		for(;den < num;den++)
		{
          if(num%den==0)
			{
			  break;
			}
           
        }
		if(num==den)
        {
			int reverse=0;
			for(int i=num;i!=0;i/=10)
			{
			int rem=i%10;
			reverse=(reverse*10)+rem;
			}
			int temp=reverse;

			while(den < reverse)
		    {
             if(reverse%den==0)
			 {
			  break;
			 }
             den++;
            }
			if(den==temp)
			{
			 System.out.println(num+" is a twisted prime number");
			}
			else
			{
				 System.out.println(num+" is a not twisted prime number");
			}



		}
		else
		{
		  System.out.println(num+" is not a prime number only");
		}
		
		
	}
}
