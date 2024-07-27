import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int count=0;
		int temp=num;
		int sum=0;
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
		
		}
		if(temp==sum)
		{
		System.out.println(temp+" is Armstrong Number");
		
		}
		else
		{
		System.out.println(temp+" is not Armstrong number");
		}

	}
}
