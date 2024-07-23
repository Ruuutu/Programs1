//A number is said to be the Disarium number when the sum of its digit raised to the power of their respective positions is equal to the number itself.
import java.util.Scanner;
class Disarium45
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int count=0,sum=0;
		int temp=num;
		sum=0;
		for(int i=num;i!=0;i/=10)
		{
		  count++;
		}
		while(num>0)
		{
		 int rem=num%10;
		 int pow=1;
			 for (int i=0;i<count ;i++ )
			 {
			  pow*=rem;
			 }
           sum+=pow;
		   num/=10;
		   count--;
		}
		if(temp==sum)
		{
		System.out.println(temp+" is disarium Number");
		
		}
		else
		{
		System.out.println(temp+" is not disarium number");
		}

	}
}
