//Armstrong Number in given range
import java.util.Scanner;
class ArmstrongNumberRangeCount48 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
        System.out.println("Enter the last");
		int last= sc.nextInt();
        int armStrongCnt=0;
		int init=start;
		while(start<=last)
		{
		 int cnt=0;
		 for(int i=start;i>0;i/=10)
			{
		     cnt++;
		    }
          int temp=start;
		  int sum=0;
		   while(temp>0)
			{
		      int rem=temp%10;
			  int pow=1;
			
			  for(int i=0;i<cnt;i++)
				{
			     pow=pow*rem;
			    }
				sum+=pow;
				temp/=10;
		    }
		   if(start==sum)
			{
			  armStrongCnt++;
		     System.out.println(start);
		    }
		 start++;

		}
		
        System.out.println("The count of prime num between "+init+ " and "+last +" are "+ armStrongCnt);

	}
}
