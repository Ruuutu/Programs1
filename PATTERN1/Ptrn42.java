class Ptrn42 
{
	public static void main(String[] args) 
	{
		int n=7;
		int star=7;
		int space=0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<space ;j++ )
			{
				System.out.print(" "+" ");
			}

			for (int j=0;j<star ;j++ )
			{
				System.out.print("*"+" ");
			}

			System.out.println();
			
			if(i<n/2)
			{
			space++;
				star-=2;
              			
			}
			else
			{
				space--;
				star+=2;
			}
		}

	}
}

/*
* * * * * * *
  * * * * *
    * * *
      *
    * * *
  * * * * *
* * * * * * *
*/