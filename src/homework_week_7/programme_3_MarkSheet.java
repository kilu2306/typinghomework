package homework_week_7;
/*
 Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */


import java.util.Scanner;

public class programme_3_MarkSheet {
    public static void main(String[] args) {
        //scanner declaration fro reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter Student Name \t\t:\t");
        String name= scanner.next();
        System.out.println("Enter studetn roll numner \t\t:\t");
        int rollNum=scanner.nextInt();
        System.out.println("Enter marks of subject maths \t:\t");
        int mathsMarks = scanner.nextInt();
        if(mathsMarks<0 || mathsMarks>100){
            System.out.println("\n Invalid input, marks should between 0 to 100");
            System.out.println("\n Please enter correct marks \t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of subject science\t:\t");
        int scineceMarks= scanner.nextInt();
        if(scineceMarks<0 || scineceMarks>100){
            System.out.println("\nInvalid input,Marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks \t\t:\t");
            scineceMarks= scanner.nextInt();
        }
        System.out.println("Enter marks of subject English \t\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks<0|| englishMarks>100){
            System.out.println("\nInvalid inpit,Marks should between 0 to 100");
            System.out.println("\nPlease enter Correct marks\t\t:\t");
            englishMarks= scanner.nextInt();
        }
        int total =sum(mathsMarks, scineceMarks, englishMarks);
        int percentage = (total*100)/300;
        String result= calculateResult(mathsMarks, scineceMarks,englishMarks);
        String grade = calculateGrade(percentage , result);
        printTheMarkSheet(name,rollNum,mathsMarks,scineceMarks,englishMarks,total,percentage,result,grade);
        //closing the scanner object
        scanner.close();
    }
    //calculation the sum
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //calculation the results on subjects marks
    public static String calculateResult(int mathsMarks , int scienceMarks ,int englishMarks){
        if (mathsMarks<35 || scienceMarks <35 || englishMarks<35) {
            return "Fail";
        }else {
            return "pass";
        }
    }
    //calculating the grade on precentage and result
    public static String calculateGrade(int percentage,String result){
        String grade = null;
        if(result.equalsIgnoreCase("pass")){
            if (percentage>=80) {
                grade = "A+";
            }else if (percentage>=60){
                grade="A";
            }else if (percentage>=50){
                grade="B";
            }else if (percentage>=35){
                grade="c";
            }
            else{
                grade="_";
            }
        }return grade;
    }
    //printing the marks sheet
    public static void  printTheMarkSheet(String name ,int rollNum, int mathsMarks , int scienceMarks,int englishMarks, double total, double percentage ,String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");

    }
}
