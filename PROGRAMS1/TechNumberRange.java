//Tech Number

/*A Tech number is a number that has an even number of digits and if the number is split into two equal halves(From the middle), then the square of the sum of these halves is equal to the number itself.
*/
import java.util.Scanner;
class TechNumberRange
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();
		int init=start;
		int techcnt=0;
		while(start<=last)
		{
          int num=start;
		  int cnt=0;
          for(int i=num;i!=0;i/=10)
		  {
			  cnt++;
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
				techcnt++;
			    System.out.println(num);
			 }

		  }
           start++;
        }
		   System.out.println("Total no of tech num in given range are "+techcnt);
	}
}

