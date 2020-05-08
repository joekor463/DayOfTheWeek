public class DayOfTheWeekChallenge {
    public static void main(String [] args)
    {
        printDayOfTheWeek(8);
    }
    public static void printDayOfTheWeek(int day){
        switch (day) {
            case (1):
                System.out.println ( "Monday" );
                break;
            case (2):
                System.out.println ( "Tuesday" );
                break;
            case (3):
                System.out.println ( "Thirday" );
                break;
            case (4):
                System.out.println ( "Foursday" );
                break;
            case (5):
                System.out.println ( "Friday" );
                break;
            case (6):
                System.out.println ( "Saturday" );
                break;
            case (7):
                System.out.println ( "Sunday" );
                break;
            default:
                System.out.println ( "Vse ne to" );
                break;
        }
    }
}
