//To print sum of EVEN AND ODD  digits of given number
class SumOfEvenOddDigits9
{
  public static void main(String [] args)
  {
    int num=12345;
    int evenSum=0;
    int oddSum=0;
    while(num>0)
    {
      int rem = num % 10;
      if(rem % 2 == 0)
      {
       evenSum = evenSum + rem;
      
      }
      else
      {
      oddSum = oddSum + rem;
      }
       

      num/=10;

     }

    System.out.println("Sum of even digits is "+ evenSum);
    
    System.out.println("Sum of odd digits is "+ oddSum);


    }
}
       