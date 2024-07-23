//Ends with 7 or divisible by 7
import java.util.Scanner;
class BuzzNumberRange51 
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
			if(start%7==0 || start%10==7)
			{
			  System.out.println(start);
			}
			start++;
        }
		

	}
}
