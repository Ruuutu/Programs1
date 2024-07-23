class Ptrn30 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i=0;i<n ;i++ )
		{
			for (int spaces=0 ;spaces<n-(i+1);spaces++)
			{
				System.out.print(" "+" ");
			}

			for (int star=0;star<=i;star++ )
			{ 
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
	}
}