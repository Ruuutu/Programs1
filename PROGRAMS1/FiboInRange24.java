//To print fibonacci between given range
import java.util.Scanner;
class FiboInRange24
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
		System.out.println("Enter the last");
		int last= sc.nextInt();
		int n1=0,n2=1,n3;
		for (int i=1;i<=last ;i++ )
		{
			n3=n1+n2;
			if(n1>=start && n1<=last)
			{
			  System.out.println(n1);
			}
			n1=n2;
			n2=n3;

		}


		
	}
}
