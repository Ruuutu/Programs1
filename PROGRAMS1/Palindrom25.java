//Palindrom
import java.util.Scanner;
class Palindrom25
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); //123
		int num= sc.nextInt();
	
		int reverse=0,temp=num;
		for(int i=0;0<num;i++)
		{
			int rem = num%10;
			reverse = (reverse*10)+rem;
			num=num/10;
		}


		System.out.println(reverse);
		if (temp==reverse)
		{
			System.out.println("Given number is palindrom");
		}
		else
		{
			System.out.println("Given number is not palindrom");
        }

	}
}
