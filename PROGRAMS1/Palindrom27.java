//Palindrom
import java.util.Scanner;
class Palindrom27
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); //123
		int num= sc.nextInt();
	
		int reverse=0;
		for(int i=num;i!=0;i/=10)
		{
			int rem = num%10;
			reverse = (reverse*10)+rem;
			
		}

		if (num==reverse)
		{
			System.out.println(num+" is palindrom");
		}
		else
		{
			System.out.println(num+" is not palindrom");
        }

	}
}
