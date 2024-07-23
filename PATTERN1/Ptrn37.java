class Ptrn37
{
	public static void main(String[] args) 
	{  
	   int n = 5;
	   for (int i=0;i<n ;i++ )
	   {
		 for (int j=0;j<i+1;j++ )
		   {
			  if (i>n/2)
		        {
		           for (int k=0; k<n-i; k++ )
		            {
			          System.out.print("*" + " ");

		             }
					 break;
					
		         }
			  System.out.print("*"+" ");
              
		   }
		   System.out.println();
	   }
	}
}

/*

*
* *
* * *
* *
*

*/