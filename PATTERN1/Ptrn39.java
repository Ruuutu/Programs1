class Ptrn39 
{
	public static void main(String[] args) 
	{  
		int n =7;
	   for (int i=0;i<n ;i++ )
	   {  
           if(i<n/2)
		   {
         
		   for (int spaces=0;spaces<n-i-1;spaces++ )
		     {
			   System.out.print(" "+" ");
		     }
		   for (int star=0;star< 2*i+1 ; star++ )
		    {
			   System.out.print("*" + " ");
		    }
		   System.out.println();
		   }

		   else
		      {
			   for (int space=0 ; space <i ;space++ )
		         {
			       System.out.print(" "+" ");
		         }
		  
		       for (int star=0;star<2*(n-i)-1 ;star++ )
		        {   
			      System.out.print("*"+" ");
		        }
             
		    System.out.println();
		   
		   
		   
		   }


	   }
	}
}

/*
            *
          * * *
        * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
*/