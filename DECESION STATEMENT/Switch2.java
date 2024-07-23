//Timetable
import java.util.Scanner;
class Switch2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = sc.nextLine();
        switch(day)
        {
            case "Monday":
                {
                    System.out.println("8:00-9:00:Maths");
                    System.out.println("9:00-10:00:Physics");
                    System.out.println("10:00-11:00:Chemistry");
                    System.out.println("11:00-12:00:Lunch break ");
                    System.out.println("12:00-1:00:English");
                    System.out.println("1:00-2:00:History");
                    System.out.println("2:00-3:00:Geography");
                    break;

                }
                case "Tuesday":
                {
                    System.out.println("8:00-9:00:Maths");
                    System.out.println("9:00-10:00:Chemistry");
                    System.out.println("10:00-11:00:Physics");
                    System.out.println("11:00-12:00:Lunch break ");
                    System.out.println("12:00-1:00:English");
                    System.out.println("1:00-2:00:Geography");
                    System.out.println("2:00-3:00:History");
                    break;
                }
                case "Wednesday":
                {
                    System.out.println("8:00-9:00:Physics");
                    System.out.println("9:00-10:00:Chemistry");
                    System.out.println("10:00-11:00:Maths");
                    System.out.println("11:00-12:00:Lunch break ");
                    System.out.println("12:00-1:00:English");
                    System.out.println("1:00-2:00:History");
                    System.out.println("2:00-3:00:Geography");
                    break;
                }
                case "Thursday":
                {
                    System.out.println("8:00-9:00:Maths");
                    System.out.println("9:00-10:00:Geography");
                    System.out.println("10:00-11:00:History");
                    System.out.println("11:00-12:00:Lunch break ");
                    System.out.println("12:00-1:00:English");
                    System.out.println("1:00-2:00:Physics");
                    System.out.println("2:00-3:00:Chemistry");
                    break;
                }
                case "Friday":
                {
                    System.out.println("8:00-9:00:Maths");
                    System.out.println("9:00-10:00:Geography");
                    System.out.println("10:00-11:00:History");
                    System.out.println("11:00-12:00:Lunch break ");
                    System.out.println("12:00-1:00:English");
                    System.out.println("1:00-2:00:Physics");
                    System.out.println("2:00-3:00:Computer Science");
                    break;
                }
                case "Saturday":
                {
                    System.out.println("8:00-9:00:Physical Education");
                    System.out.println("9:00-10:00:Geography");
                    System.out.println("10:00-11:00:History");
                    break;

                }
                case "Sunday":
                {
                    System.out.println("Its HOLIDAY");
                    break;

                }

                default:
                    {
                        System.out.println("Invalid day");
                    }
                

        }
    }
}