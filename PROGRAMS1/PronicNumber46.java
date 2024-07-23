//Pronic Number
import java.util.Scanner;
class PronicNumber46
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int i=1;
		while(true)
		{
			if(i*(i+1)==num)
			{
			  System.out.println(temp+" is pronic number");
			  break;
			}
			else
			{
			  System.out.println(temp+" is not pronic number");
			}
			i++;
			
		}
	}
}
