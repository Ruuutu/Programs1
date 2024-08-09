class CurrencyConverter 
{
	public static void main(String[] args) 
	{
	    rupeesToDoller(1.2);  
		rupeesToEuro(90.1);
		rupeesToRubel(1);
		rupeesToDirham(5);
	}

	public static void rupeesToDoller(double rupees)
	{
      double dollar = 0.012*rupees;	
	  System.out.println("Rs "+rupees+ " is equals to $"+dollar);
 	}
   
    public static void rupeesToEuro(double rupees)
	{
      double euro = 0.011*rupees;	
	  System.out.println("Rs "+rupees+ " is equals to "+euro +" euro");
 	}

    public static void rupeesToRubel(double rupees)
	{
      double rubel = 1.03*rupees;	
	  System.out.println("Rs "+rupees+ " is equals to "+rubel +" rubel");
 	}
    
	public static void rupeesToDirham(double rupees)
	{
      float dirham = (float)(0.044*rupees);	
	  System.out.println("Rs "+rupees+ " is equals to "+dirham +" dirham");
 	}

}
