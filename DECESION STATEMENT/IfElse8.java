//blood donation
import java.util.Scanner;
class IfElse8
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        if(age>=18 && age<=65)
        {
            System.out.println("Enter the gender");
            String gender=sc.next();
           
            if(gender=="male")
            {
                sc.nextLine();
                System.out.println("Enter the hb");
                float hb=sc.nextFloat();
                if(hb>=13.0)
                {
                    System.out.println("You can donate blood");
                }
                else
                {
                    System.out.println("You can't donate blood");
                }
            }
            else if(gender=="female")
            {
                sc.nextLine();
                System.out.println("Enter the hb");
                float hb=sc.nextFloat();
                if(hb>=12.0)
                {
                    System.out.println("You can donate blood");
                }
                else
                {
                    System.out.println("You can't donate blood");
                }



            }
        }
    }

}
    
