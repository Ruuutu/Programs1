import java.util.Scanner;
class TwinPrime58
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start");
		int n1=sc.nextInt();
		System.out.println("Enter the last");
		int n2=sc.nextInt();
		int den=2;
		int num1=n1;
		int num2=n2;
		while(den <= num1)
		{
          if(num1%den==0)
			{
			  
			  break;
			}
          
			den++;

		}
		if(num1==den)

	    {
			int den2=2;
	while(den2 <= num2)
		{
          if(num2%den2==0)
			{
			  
			  break;
			}
          
			den2++;

		}
		if(num2==den2)

		
		{
			System.out.println(n2+" is prime number");
			
				if((n2-n1==2 )||(n1-n2==2))
			   {
					System.out.println("Twin");
			   }
			   else
			{ 
			    System.out.println(" Not Twin");
			   }
			

		}
		else
		{
			System.out.println(n2+" is not prime number");
		
		}

		}
		else
		{
			System.out.println(n1+" is not prime number");
		 }


    
    }


}



 