
class Ptrn44 
{
	public static void main(String[] args) 
	{
		int n =7;
		int star =7;
		int space =0;

		for (int i=0;i<n ;i++ )
		{   
			for (int j=0; j<space ;j++ )
			{ 
				System.out.print(" "+" ");
			}
		
		
			for (int j=0;j<star ; j++)
			{
				System.out.print("*"+" ");

			}

				System.out.println();
		
				
				if(i>=n/2)
				{
					star+=2;
					space-=2;

				}
				else
				{
					star-=2;
				    space+=2;
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