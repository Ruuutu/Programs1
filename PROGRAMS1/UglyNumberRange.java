//Check for ugly number
//positive integer whose prime factors are limited to 2 , 3 , and 5
import java.util.Scanner;
class UglyNumberRange 
{
 public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start");
		int start= sc.nextInt();
		System.out.println("Enter the last");
		int last=sc.nextInt();
		int init=start;
		int cnt=0;
		while(start<=last)
		{
		  int num=start;
		  int temp=num;
		 while(temp!=0)
		   {
			if (temp%2==0)
			{
				temp/=2;
			}
            else if (temp%3==0)
			{
				temp/=3;
			}
            else if (temp%5==0)
			{
				temp/=5;
			}
			else{break;}
          }
		if(temp==1)
		   {
			cnt++;
		   System.out.println(num);
		   }
		   start++;
		}
		
		

		System.out.println("Total no of tech num in given range are "+cnt);
	}
}
