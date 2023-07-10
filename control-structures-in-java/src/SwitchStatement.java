import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.print("Enter a day index : ");
        Scanner dayScanner = new Scanner(System.in);
        int dayIndex = dayScanner.nextInt();
        dayScanner.close();

//        if (dayIndex == 1) {
//            System.out.println("Day: Sunday");

//        } else if (dayIndex == 2) {
//            System.out.println("Day: Monday");

//        } else if (dayIndex == 3) {
//            System.out.println("Day: Tuesday");

//        } else if (dayIndex == 4) {
//            System.out.println("Day: Wednesday");

//        } else if (dayIndex == 5) {
//            System.out.println("Day: Thursday");

//        } else if (dayIndex == 6) {
//            System.out.println("Day: Friday");

//        } else if (dayIndex == 7) {
//            System.out.println("Day: Saturday");

//        } else {
//            System.out.println("There are only 7 days in a week");
//        }

        switch (dayIndex) {
            case 1:
                System.out.println("Day : Sunday");
                break;

            case 2:
                System.out.println("Day : Monday");
                break;

            case 3:
                System.out.println("Day : Tuesday");
                break;

            case 4:
                System.out.println("Day : Wednesday");
                break;

            case 5:
                System.out.println("Day : Thursday");
                break;

            case 6:
                System.out.println("Day : Friday");
                break;

            case 7:
                System.out.println("Day : Saturday");
                break;

            default:
                System.out.println("Only the values 1-7 are permitted. Try again.");

        }
    }
}
