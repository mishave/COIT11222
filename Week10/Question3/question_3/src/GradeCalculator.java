import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String student_id = scanner.nextLine();

        System.out.print("Enter student last name: ");
        String last_name = scanner.nextLine();

        System.out.print("Enter mark for Assignment 1 (out of 25): ");
        int assignment1_mark = scanner.nextInt();

        System.out.print("Enter mark for Assignment 2 (out of 25): ");
        int assignment2_mark = scanner.nextInt();

        System.out.print("Enter mark for Assignment 3 (out of 50): ");
        int assignment3_mark = scanner.nextInt();

        // Calculate the total mark
        int total_mark = assignment1_mark + assignment2_mark + assignment3_mark;

        // Determine the grade based on the total mark
        String frmt_string;
        if (total_mark < 0 || total_mark > 100) {
            frmt_string = "Invalid data entry. Total mark must be between 0 and 100. Total = "+total_mark;
        } else if (total_mark < 50) {
            frmt_string =  String.format("%s %s %d f", student_id, last_name,total_mark);
        } else if (total_mark < 65) {
            frmt_string =  String.format("%s %s %d P", student_id, last_name,total_mark);
        } else if (total_mark < 75) {
            frmt_string =  String.format("%s %s %d C", student_id, last_name,total_mark);
        } else if (total_mark < 85) {
            frmt_string =  String.format("%s %s %d D", student_id, last_name,total_mark);
        } else {
            frmt_string =  String.format("%s %s %d HD", student_id, last_name,total_mark);
        }

        // Display the output
        System.out.println(frmt_string);

        // Close the scanner
        scanner.close();
    }
}
