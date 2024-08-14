import java.util.Scanner;
class EvenNumInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start");
		int start=sc.nextInt();
		System.out.println("Enter the last");
		int end=sc.nextInt();
		evenInRange(start,end);

	}
	public static boolean isEven(int num)
	{
	 return num%2==0;
	}

	 public static void evenInRange(int start,int end)
	{
	 while(start<=end)
		{
	     if(isEven(start))
			{
		     System.out.println(start);
		    }
			start++;
	    }
	 
	 }
}
