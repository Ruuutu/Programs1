import java.util.Scanner;
class ArmStrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
		System.out.println("Enter the last");
		int last= sc.nextInt();
		while(start<=last)
		{
		if(isArmstrong(start))
		{
		  System.out.println(start);
		}
		start++;
		
		}
	}

	public static int count(int num)
	{
	 int cnt=0;
	 for (;num!=0;num/=10 )
	 {
		 cnt++;
	 }
	 return cnt;
	}

	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=0;i<raise;i++)
		{
		 pow=pow*base;
		}
		return pow;
	}
  
    public static boolean isArmstrong(int num)
	{
		int sum=0;
     for (int i=num;i!=0 ;i/=10 )
     {
		 sum+=power(i%10,count(num));
     }
	 return sum==num;
    }
}
