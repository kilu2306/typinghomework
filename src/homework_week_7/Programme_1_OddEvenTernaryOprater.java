package homework_week_7;

import java.util.Scanner;

/* 1. write a java program that tells us that input number is odd or even
hint :use ternary operator (?:)
 */
public class Programme_1_OddEvenTernaryOprater {
    public static void main(String[] args) {
        //scabnner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number ");
        int number= scanner.nextInt();
        isItOddOrEevnNumber(number);
      //closing the scanner object
        scanner.close();
    }
    //checking the number is even or odd
    public static void isItOddOrEevnNumber(int number){
        //ternary oprater is used
        String evenOrOdd =(number%2==0) ? "even":"odd";
        System.out.println("the "+number+" is "+evenOrOdd+" number ");
    }
}
