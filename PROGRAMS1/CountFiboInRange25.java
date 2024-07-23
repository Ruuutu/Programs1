//To print total fibonacci number  between given range
import java.util.Scanner;
class CountFiboInRange23
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
		System.out.println("Enter the last");
		int last= sc.nextInt();
		int n1=0,n2=1,n3,count=0;
		for (int i=1;i<=last ;i++ )
		{
			n3=n1+n2;
			if(n1>=start && n1<=last)
			{
			 count++;
			}
			n1=n2;
			n2=n3;

		}
        System.out.println("The total count of fibonacii numbers between "+ start + " and " + last + " is " +count);


		
	}
}
