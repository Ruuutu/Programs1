import java.util.Scanner;
class BuzzNumInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int end=sc.nextInt();
		printBuzzInRange(start,end);
    }

	public static void printBuzzInRange(int start,int end)
	{
	 while(start<=end)
		{
		 if(isBuzzNum(start))
			{
		      System.out.println(start);
		    }
	     start++;
	    }
	}

	public static boolean isBuzzNum(int num)
	{
	  return num%10==7 || num%7==0;
	}
}
