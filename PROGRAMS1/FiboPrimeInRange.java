import java.util.Scanner;

class FiboPrimeInRange 
	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start"); // 1
        int start = sc.nextInt();
        System.out.println("Enter the last"); // 5
        int last = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;

        for (int i = 0; i < last; i++) 
			{
            n3 = n1 + n2;
            if (n1 >= start && n1 < last) 
				{
                int den=2;
                for (; den < n1 ; den++) 
					{ 
                    if (n1 % den == 0)
						{
                        break;
                    }
                }
                if (den == n1) 
					{ 
                    System.out.println(n1);
                }
            }

            n1 = n2;
            n2 = n3;
        }
    }
}
