import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Weight in kilograms
        System.out.print("Enter your weight (in kilograms): ");
        double weight = scanner.nextDouble();

        // Input: Height in meters
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Error handling for negative values
        if (weight < 0 || height < 0) {
            System.out.println("Error: Weight and height cannot be negative.");
            scanner.close();
            return;
        }

        // Calculate BMI
        double bmi = weight / (height * height);

        // Interpretation of BMI
        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            interpretation = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }

        // Display BMI and interpretation
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Interpretation: " + interpretation);
        scanner.close();
    }
}
