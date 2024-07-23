//count of prime numbers between range 
import java.util.Scanner;
class PrimeNumRangeCountIsFibo58
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
        int n1 = 0, n2 = 1, n3;
    for(int i = 0; ; i++)
    {
		if(count == n1)
        {
        System.out.println("The count is in fibonacci series " );
		break;
    
        }
		else if(n1>count)
		{
			System.out.println("The count is in not fibonacci series " );
			break;
		}
        
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
    }








	}
}
