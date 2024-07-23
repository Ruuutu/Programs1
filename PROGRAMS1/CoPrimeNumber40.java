import java.util.Scanner;
class CoPrimeNumber40
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		int num1= sc.nextInt();
        
		System.out.println("Enter the second Number:");
		int num2= sc.nextInt();

		int small=(num1<num2?num1:num2);
		int hcf;
		while(true)
		{
		if(num1%small==0 &&num2%small==0)
			{
              hcf=small;
			  break;

		    }
			small--;
		}

		if(hcf==1)
		{
		 System.out.println(num1 +" and "+num2 +" are co-prime number");
		}
		else
		{ 
			 System.out.println(num1 +" and "+num2 +" are not co-prime number");
		}


	}

}