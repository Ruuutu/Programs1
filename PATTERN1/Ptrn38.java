class Ptrn38
{
	public static void main(String[] args) 
	{  
		int n =5;
	   for (int i=0;i<n ;i++ )
	   {
		   for (int spaces=0;spaces<n-i-1;spaces++ )
		   {
			   System.out.print(" "+" ");
		   }
		   for (int star=0;star< 2*i+1 ; star++ )
		   {
			   if(star==0 || star==2*i ||i==n-1)
			   {
			     System.out.print("*" + " ");

			   }
			   else 
			   { 
				   System.out.print(" "+" ");
			   }
		   }
		   System.out.println();
	   }
	}
}