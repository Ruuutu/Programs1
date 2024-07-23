//Pattern to print taking user input
import java.util.Scanner;
class Ptrn7UserInput
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length :");
	     int length = sc.nextInt();

		System.out.println("Enter the height :");
	     int height = sc.nextInt();

		for (int out=0;out<height ;out++ )
		{
			for(int in=0;in<length;in++)
			{
				System.out.print("*" + "   ");
				
			}
             System.out.println();
		}
		
	}
}

