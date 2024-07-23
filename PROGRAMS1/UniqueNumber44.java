//unique Number( digits are not duplicate.)
import java.util.Scanner;
class UniqueNumber44  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number!");//113
		int num=sc.nextInt();
		int n1=num;
		int count=0;
		while(n1>0)
		{
		  int rem1=n1%10;
		  int n2=n1/10;
		  while(n2>0)
			{
			  int rem2=n2%10;
			  if(rem1==rem2)
				{
				  count++;
				  if(count>0)
					{break;}
			    }
			
			  n2/=10;
		  
		    }
		  n1/=10;
		}
			
		
		if(count==0)
		{
		  System.out.println(num+" is a unique number");
		}
		else
		{
		  System.out.println(num+" is not a unique number");
		}

	}
}
