//To add digits present in the number
class AddDigits5
{
  public static void main(String[] args)
  {
     int num=123;
     
     int sum=0;
     
     while(num>0)
     {
      int rem=num%10;
       sum=sum+rem;
       num/=10;
     }

     System.out.println("Sum of all digits in given number is "+sum);

  }

}
