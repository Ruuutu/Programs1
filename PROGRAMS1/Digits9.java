//To print sum of even digits  and product of odd digits of given number are same or not
class SumOfEvenOddDigits9
{
  public static void main(String [] args)
  {
    int num=12345;
    int sum=0;
    
    int product=1;
    while(num>0)
    {
      int rem = num % 10;
      if(rem % 2 == 0)
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
    System.out.println("Sum of even dogits and product of odd digits are same");
    }
    else
    {
    System.out.println("Sum of even dogits and product of odd digits are not same");
    }


    }
}
       