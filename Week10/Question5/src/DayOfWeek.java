import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day_number = input.nextInt();

        String day;
        if (day_number == 1) {
            day = "Sunday";
        } else if (day_number == 2) {
            day = "Monday";
        } else if (day_number == 3) {
            day = "Tuesday";
        } else if (day_number == 4) {
            day = "Wednesday";
        } else if (day_number == 5) {
            day = "Thursday";
        } else if (day_number == 6) {
            day = "Friday";
        } else if (day_number == 7) {
            day = "Saturday";
        } else {
            day = "Invalid day number";
        }

        System.out.println("Day of the week: " + day);
        input.close();
    }
}
