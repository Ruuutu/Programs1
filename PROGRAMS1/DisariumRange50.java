//A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions is equal to the number itself.
import java.util.Scanner;
class DisariumRange50
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();

		while(start<=last)
		{
			int cnt=0;
			for(int i=start;i!=0;i/=10)
			{
				cnt++;
			}
            int sum=0;
			for(int i=start;i!=0;i/=10)
			{
			  int rem=i%10;
			  int pow=1;
			  for(int j=0;j<cnt;j++)
				{
			     pow*=rem;
				}
				sum+=pow;
				cnt--;
			}

            if (sum==start)
            {
				System.out.println(start);
            }

		  start++;
		}


	}


}
