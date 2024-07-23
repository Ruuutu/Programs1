//Hotel Menu  Card
import java.util.Scanner;
class HotelMenuCard
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food Category :VEG/NONVEG");
        String ip = sc.next();
        switch(ip)
        {
            case "VEG":
                {
                System.out.println("Veg Food Menu");
                System.out.println("1:POHA-20Rs/Plate");
                System.out.println("2:UPMA-25Rs/Plate");
                System.out.println("3:IDLI-30Rs/Plate");
                System.out.println("ENTER THE THE NO OF FOOD ITEM YOU WANT TO ORDER");
                int ip1 = sc.nextInt();
                
                
                switch(ip1)
                {

                    case 1:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*20;
                        System.out.println("Your Bill is "+bill);
                        break;
                        }
                    case 2:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*25;
                        System.out.println("Your Bill is "+bill);
                        break;
                        }
                    case 3:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*30;
                        System.out.println("Your Bill is "+bill);
                        break;

                        }
                    }
                    break;

                }

                
                case "NONVEG":
                {
                
                System.out.println("NONVEG Food Menu");
                System.out.println("1:BOILED EGG-20Rs/Plate");
                System.out.println("2:BHURGI-25Rs/Plate");
                System.out.println("3:ANDA RICE-30Rs/Plate");
                System.out.println("ENTER THE THE NO OF FOOD ITEM YOU WANT TO ORDER");
                int ip2 = sc.nextInt();
                  
                switch(ip2)
                {
                    case 1:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*20;
                        System.out.println("Your Bill is "+bill);
                        break;
                        }
                    case 2:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*25;
                        System.out.println("Your Bill is "+bill);
                        break;
                        }
                    case 3:
                        {
                        System.out.println("How many plates?");
                        int n = sc.nextInt();
                        int bill = n*30;
                        System.out.println("Your Bill is "+bill);
                        break;

                    }

                 
                }












                  
            }    
       
        }  

    }
}



    
