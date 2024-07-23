//Pattern to print alternate digit
class Ptrn6AlternateNum
{
	public static void main(String[] args) 
	{   
	     int num=1;
		for (int out=0;out<4 ;out++ )
		{
			for(int in=0;in<4;in++)
			{
				System.out.print(num + "   ");
				num+=2;
				
				
			}
             System.out.println();
		}
		
	}
}
/*
1   3   5   7
9   11   13   15
17   19   21   23
25   27   29   31
*/