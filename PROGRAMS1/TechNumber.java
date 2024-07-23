//Tech Number

/*A Tech number is a number that has an even number of digits and if the number is split into two equal halves(From the middle), then the square of the sum of these halves is equal to the number itself.
*/
import java.util.Scanner;
class TechNumber
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int cnt=0;
		for(int i=num;i!=0;i/=10)
		{cnt++;
		}
		if(cnt%2==0)
		{
		  int den=1;
		  for(int i=0;i<cnt/2;i++)
			{
			  den=den*10;
		    }
			
			int sum=(num%den)+(num/den);;
			if(sum*sum==num)
			{
			System.out.println(num +" is a tech number");
			}
			else
				{
			System.out.println(num +" is not tech number");
			}

		}
		else
				{
			System.out.println(num+" is not tech number");
			}
				

	}
}
