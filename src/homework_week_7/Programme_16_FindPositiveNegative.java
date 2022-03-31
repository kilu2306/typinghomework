package homework_week_7;

import java.util.Scanner;

//Write the java program to check if enter number is possitive or negative or zer0
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //scanner declaration fro reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //closing the scanner object
        scanner.close();

    }
    //finding the number is positive negative or zero
     public static void findNumberIsPositiveNegativeOrZero(int number){

        if(number>0) {
            System.out.println(number + " is a Positive number ");
        }else if (number<0) {
            System.out.println(number + " is a negative number ");
        } else {
            System.out.println(number + " is zero");
        }
     }
}

