//Strong Number in given Range
import java.util.Scanner;
class StrongNumberRange49 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();

		while (start<=last)
		{   
			int temp=start;
			int sum=0;
            while (temp>0)
            {
				int rem= temp%10;
				int fact=1;
				
				for (int j=rem;j>=1 ;j-- )
				{
					fact=fact*j;
				}
				sum+=fact;
				temp/=10;
            }
			if(sum==start)
			{
			 System.out.println(start);

			}
         start++;

		}

	}
}
