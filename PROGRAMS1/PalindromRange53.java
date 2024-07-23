//Palindrom
import java.util.Scanner;
class PalindromRange53
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
		int reverse=0;
		for(int i=start;i!=0;i/=10)
		{
			int rem = i%10;
			reverse = (reverse*10)+rem;
			
		}

		if (start==reverse)
		{
			System.out.println(start);
		}
		start++;
		}
	}
}

