class Ptrn40 
{
	public static void main(String[] args) 
	{
		int n =7;
		int star =n;

		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<star ; j++)
			{
				System.out.print("*"+" ");

			}

				System.out.println();
		
				
				if(i>=n/2)
				{
					star+=2;
				}
				else
				{
					star-=2;
				
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