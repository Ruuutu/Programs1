//print even numbers between given range using for
/*
import java.util.Scanner;
class P1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            System.out.println(i);
        
        }

    }

}
*/
//print even numbers between given range using while
import java.util.Scanner;
class NumbersInGivenRange1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start:");
        int start=sc.nextInt();
        System.out.println("Enter the end:");
        int end=sc.nextInt();
       
        while(start<=end)
        {
            if(start%2==0)
            System.out.println(start);
               start++;
        }

     
     
        
    }
}