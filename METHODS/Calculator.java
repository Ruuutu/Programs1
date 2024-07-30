class Calculator 
{
	public static void main(String[] args) 
	{
		addition(1234,673);
		subtraction(1234,123);
		multiplication(123,1);
		aamAdamiKaDivision(789,2);
		programmerKaDivision(789,2);

	}

	public static void addition(int num1,int num2)
	{
      int res=num1+num2;
	  System.out.println(res);
	}

	public static void subtraction(int num1,int num2)
	{
      int res=num1-num2;
	  System.out.println(res);
	}

	public static void multiplication(int num1,int num2)
	{
      int res=num1*num2;
	  System.out.println(res);
	}

	public static void aamAdamiKaDivision(double num1,double num2)
	{
	  float res=(float)(num1/num2);
	  System.out.println(res);
	}
	public static void programmerKaDivision(int num1,int num2)
	{
	 int res=num1/num2;
	 System.out.println(res);
	}

}
