import java.util.Scanner;
class Lcm38 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number:");
		int num1= sc.nextInt();
        
		System.out.println("Enter the second Number:");
		int num2= sc.nextInt();

		int large =(num1>num2?num1:num2);
		
		int i=1;
        while(true)
		{
		if((large*i)%num1==0 && (large*i)%num2==0)
		{
			System.out.println("Lcm is "+large*i);
			break;
		}
			
			i++;
		}

	}
}
