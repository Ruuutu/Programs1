class Ptrn36

{
	public static void main(String[] args) 
	{  
	   int n =5;
	   int a = n-1;
	   for (int i=0;i<n ;i++ )
	   {
		   for (int space=0 ; space <i ;space++ )
		   {
			  System.out.print(" "+" ");
		   }
		  
		   for (int star=0;star<n+a ;star++ )
		   {   
			  
			   System.out.print("*"+" ");
		   }
             a-=2;
		    System.out.println();
	   }
	}
}

/*
* * * * * * *
  * * * * *
    * * *
      *
*/