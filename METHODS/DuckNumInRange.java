import java.util.Scanner;
class DuckNumInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int end=sc.nextInt();
		printDuckInRange(start,end);
    }
	public static boolean isDuck(int num)
	{
	 while(num!=0)
		{
	    return num%10==0;
		}
		num/=10; 
		return false;
	
	}

	public static void printDuckInRange(int start,int end)
	{
	 while(start<=end)
		{
		 if(isDuck(start))
			{
		      System.out.println(start);
		    }
	     start++;
	    }
	}
}