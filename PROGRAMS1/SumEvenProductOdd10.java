//To Ckeck if sum of even digits and the product of odd digits are equal or not
import java.util.Scanner;
class SumEvenProductOdd10
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number");
   int num = sc.nextInt();
   int sum=0;
   int product=1;
   while(num>0)
   {
     int rem = num % 10;
	 if(rem%2==0)
	   {
        sum = sum + rem;
       }
	   else
	   {
        product = product * rem;
	   }
     num/=10;
   }
   if(sum==product)
   {
     System.out.println("Sum of even digits and the product of the odd digits are same");
   }
   else
   {
     System.out.println("Sum of even digits and the product of the odd digits are not same");
   }
 }
}