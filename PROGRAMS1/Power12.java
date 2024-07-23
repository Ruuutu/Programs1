//To find the power of number
import java.util.Scanner;
class Power12
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the base ");
  int base = sc.nextInt();
  System.out.println("Enter the raise");
  int raise = sc.nextInt();
  
  int pow = 1;
  
  for(int i = 0; i < raise ; i++)
  {
   pow = pow * base;
  }

  System.out.println(pow);

  }
 }