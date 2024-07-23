//Product of digits in given number
class ProductOfDigits6
{
  public static void main(String[] args)
  {
    int num=123;
    int product = 1;
    while(num>0)
    {
     int rem=num%10;
     product = product * rem;
     num/=10;
    }
    System.out.println("Product Of Digits in given num is "+product);
   }
}