//Check entire number contains only prime digit or not
import java.util.Scanner;
class NumContainOnlyPrimeDigit57 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");//123
		int num=sc.nextInt();
		int temp=num;
        while(num>0)
		{
		  int rem= num%10;
		  if ( rem == 2 || rem == 3 || rem ==5 || rem ==7 )
		    {
			  System.out.println(temp+" does not contain only prime digits");
			  break;
		     }
         num/=10;
		 
		
		}
		if(num==0)
		{
		System.out.println(temp+" does contain only prime digits");
		}

		
		

	}
}
