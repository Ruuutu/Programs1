//Colour suggestion
import java.util.Scanner;
class Switch4
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String ip = sc.nextLine();
        switch(ip)
        {
        case "Monday":
            { 
            System.out.println("Todays colour is PURPLE");
            break;
            }

        case "Tuesday":
            {
                System.out.println("Todays colour is RED");
                break;
            }

        case "Wednsday":
            {
                System.out.println("Todays colour is WHITE");
                break;
            }

        case "Thursday":
            {
                System.out.println("Today colour is YELLOW");
                break;
            }
        case "Friday":
            {
                System.out.println("Todays colour is GREEN");
                break;
            }
        
        case "Saturday":
            {
                System.out.println("Todays colour is BLUE");
                break;
            }

        case "Sunday":
            {
                System.out.println("Todays colour is ORANGE");
                break;
            }
        default:
            {
                System.out.println("Enter the valid day");
            }
        }
        


    }
}
