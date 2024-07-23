//To print sum of even digits of given number
class SumOfEvenDigits8
{
  public static void main(String [] args)
  {
    int num=12345;
    int sum=0;
    while(num>0)
    {
      int rem = num % 10;
      if(rem % 2 == 0)
      {
       sum = sum + rem;
      
      }

      num/=10;

     }

    System.out.println("Sum of even digits in given num is "+sum);


    }
}
       