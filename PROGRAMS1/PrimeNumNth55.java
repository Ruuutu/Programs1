//count of prime numbers between range 
import java.util.Scanner;
class PrimeNumNth55
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("To Find nth prime number,Enter the value of n:");
		int n=sc.nextInt();
		int start=2;
		int i=0;
		while(i<n)
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
		     i++;
			 if(i==n)
				{
				 System.out.println(start);
			    }
		    }
        start++;
		}
    }
}





		