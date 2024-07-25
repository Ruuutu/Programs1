import java.util.Scanner;
class ToFindNextPrevPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int nextPrime=num;
		int prevPrime=num;
		int den=2;
		while(den < num)
		{
          if(num%den==0)
			{
			  break;
			}
            den++;
        }


		if(num==den)
		{
			System.out.println(num+" It already is prime number");
		}
		else
		{
			while(true)
			{
				 nextPrime++;
				 for (den=2;den<nextPrime;den++ )
				 {
					 if(nextPrime%den==0)
					 {
						 break;
					 }
				 }

                if(den==nextPrime)
				{
				System.out.println("Next prime num is "+nextPrime);
				break;
				}
             
			}

            while(prevPrime>1)
			{
				 prevPrime--;
				 for (den=2;den<prevPrime ;den++ )
				 {
					 if(prevPrime%den==0)
					 {
						 break;
					 }
				 }
                if(den==prevPrime)
				{
				System.out.println("previous prime num is "+prevPrime);
				break;
				}

			}
       }
    }
}
