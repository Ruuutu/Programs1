import java.util.Scanner;
class EvenOddWithoutModulus
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the number");
		int num= sc.nextInt();
        
	    if((num/2)*2==num)
		   {
		     System.out.println(num+"is a even number");
			 return;
		   }
		  
         System.out.println(num+"is a odd number");
    }
}  