//To print total num of digits in given num

import java.util.Scanner;

class CountDigitsInNum33
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num");
       int num = sc.nextInt();
       int count = 0;
       while(num>0)
       {
         num/=10;
         count ++;

    

       }
       System.out.println("Count f digits in the given num is "+ count);

    }
}
