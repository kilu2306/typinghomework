package homework_week_7;
/* write a java program to inout any year like (ex.2007) and find out id it is leap year or not ?
 */

import java.util.Scanner;

public class Programme_2_Leapyear {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year:");
        int year = scanner.nextInt();
        Programme_2_Leapyear leapYear = new Programme_2_Leapyear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();
    }

    //checking is it leap year or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("the year " + year + " is leap year ");
            return;
        }
        System.out.println(" this year " + year + " is not aleap year ");
    }
}



