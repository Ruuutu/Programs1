// To find prime number berween given range
import java.util.Scanner;
class PrimeNumInRnage47 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start:");
		int start = sc.nextInt();
		System.out.println("Enter the last:");
		int last = sc.nextInt();
		while(start<=last)
		{
		
	          int den=2;	  
			 for(;den<start;den++)
			{
		      if(start%den==0)
				{
			      break;
			    }
		    }
			if(den==start)
			{
			System.out.println(start);
			}
			
		
		start++;
		}

	}
}
