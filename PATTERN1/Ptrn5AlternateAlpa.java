//Pattren to print alternate alphabet
class
{
	public static void main(String[] args) 
	{   
		char ch='A';
		for (int out=0;out<4 ;out++ )
		{
			for(int in=0;in<4;in++)
			{
				System.out.print(ch + " ");
				ch+=2;
				
				if(ch>'Z')
				{
				  ch='A';
				}
			
			}
             System.out.println();
		}
		
	}
}
/*

A C E G
I K M O
Q S U W
Y A C E
*/