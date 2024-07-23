//To determine whether given number is Perfect or not.
// sum of digits and product of digits of number must be same
class PerfectNumber7
{
	 public static void main(String[] args)
	{
         int num =123;
         int sum=0;
         int product =1;
    while(num > 0)
	{
	 int rem=num % 10;
	 sum = sum + rem;
	 product =product * rem;
	 num/=10;
	}

	if(sum==product)
	{
		System.out.println("It is perfect number");
	}
	else
	{
		System.out.println("It is not perfect number");

	}
	}


  
}