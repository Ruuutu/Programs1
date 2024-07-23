//count of prime numbers between range 
import java.util.Scanner;
class PrimeNumRangeCountIsPrime58
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();
		int count=0;
		int temp=start;
		
        while(start<=last)
		{
		  
		  int den=2;
		  for (;den<start ;den++ )
		  {
			  if(start%den==0)
			  {
			    break;
			  }
			  
		  }
		  if(den==start)
			{
			  System.out.println(start);
			  count++;
		    }
			start++;
		}
		System.out.println("The count of prime num between "+temp+ " and "+last +" are "+ count);
        int den=2;
        while(den < count)
		{
          if(count%den==0)
			{
			  
			  break;
			}
          
			den++;

		}
		if(count==den)

		
			{
			System.out.println("count is prime number");

		}
		else
		{
			System.out.println("count is not prime number");
		
		}









	}
}
