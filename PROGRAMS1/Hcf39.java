import java.util.Scanner;
class Hcf39
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		int num1= sc.nextInt();
        
		System.out.println("Enter the second Number:");
		int num2= sc.nextInt();

		int small=(num1<num2?num1:num2);
		
		while(true)
		{
		if(num1%small==0 &&num2%small==0)
			{
              System.out.println("Hcf is "+small);
			  break;

		    }
			small--;
		}
	}

}