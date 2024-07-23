//Sum of digits of square of number is number itself
import java.util.Scanner;
class NeonNumberRangeCount51 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();
		int init=start;
		int count=0;
        while(start<=last)
		{
		 
		 int sqaure=start*start;
		 int sum=0;
		  for (int i=sqaure;i!=0;i/=10)
			{
			  int rem=i%10;
			  sum+=rem;
		   
		    }
			if(sum==start)
			{ 
			  count++;
			  System.out.println(start);
			 
			}

			start++;
		}
       System.out.println("The count of neon num between "+init+ " and "+last +" is "+count );
	}
}