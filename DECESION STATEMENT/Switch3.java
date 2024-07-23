//Valentine Week
import java.util.Scanner;
class Switch3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        int n = sc.nextInt();
        if(n>=7 && n<=14)
        {

        
           switch(n)
           {
            case 7:
                {
                System.out.println("Rose Day");
                break;
                }

            case 8:
                {
                    System.out.println("Propose Day");
                    break;
                }

            case 9:
                {
                    System.out.println("Chocolate Day");
                    break;
                }

             case 10:
                {
                    System.out.println("Teddy Day");
                    break;
                }

             case 11:
                {
                    System.out.println("Promise Day");
                    break;
                }

             case 12:
                {
                    System.out.println("Hug Day");
                    break;
                }
                 case 13:
                {
                    System.out.println("KISS Day");
                    break;
                }
                 case 14:
                {
                    System.out.println("VALENTINES Day");
                    break;
                }
           }
        }
        else
        {
           System.out.println("Invalid Input");
        }

    }

}