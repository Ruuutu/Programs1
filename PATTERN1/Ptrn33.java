class Ptrn33
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i=0;i<n ;i++ )
		{
			for (int spaces=0 ;spaces<i;spaces++)
			{
				System.out.print(" "+" ");
			}

			for (int star=0;star < n - i;star++ )
			{ 
				System.out.print((star+1)+" ");
			}
			
			System.out.println();
		}
	}
}
/*
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
		*/