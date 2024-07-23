//Reverse the number
import java.util.Scanner;
class ReverseNum24
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); //123
		int num= sc.nextInt();
		int reverse=0;
		for(int i=0;i<=num;i++)
		{
			int rem = num%10;
			reverse = (reverse*10)+rem;
			num=num/10;
		}
		System.out.println(reverse);

	}
}
