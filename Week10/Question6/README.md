## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Step-by-Step Explanation of the code
This program combines various elements such as user input, mathematical calculations, conditional statements, and output formatting in a Java program.

### Step 1: Importing a Package
```java
import java.util.Scanner;
```
We start by importing the Scanner class from the `java.util` package, which enables us to read input from the user. It's quite similar to Python's `input()` function, but offers more flexibility with data types.

### Step 2: Declaring a Public Class
```java
public class BMI {
```
Next, we define a public class named `BMI`. In Java, every program is enclosed within a class, which forms the blueprint of objects that contain methods to perform actions.

### Step 3: Main Method
```java
public static void main(String[] args) {
```
Here, we declare the main method, which is the entry point of our application. This method gets called when the program starts running.

### Step 4: Creating a Scanner Object
```java
Scanner scanner = new Scanner(System.in);
```
We create an instance of the Scanner class named `scanner`, which facilitates the reading of input values from the user.

### Step 5: Collecting User Inputs
```java
System.out.print("Enter your weight (in kilograms): ");
double weight = scanner.nextDouble();

System.out.print("Enter your height (in meters): ");
double height = scanner.nextDouble();
```
In this step, we prompt the user to enter their weight and height. We then store these inputs in respective variables `weight` and `height` of type double (which can hold decimal values).

### Step 6: Error Handling
```java
if (weight < 0 || height < 0) {
    System.out.println("Error: Weight and height cannot be negative.");
    scanner.close();
    return;
}
```
Here, we perform error handling to check if the user entered negative values for weight or height. If so, an error message is displayed and the program exits.

### Step 7: Calculating the BMI
```java
double bmi = weight / (height * height);
```
Next, we calculate the Body Mass Index (BMI) using the formula \( \text{BMI} = \frac{\text{weight}}{\text{height}^2} \), and store the result in the `bmi` variable.

### Step 8: Interpreting the BMI
```java
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
```
In this step, we interpret the calculated BMI value to determine the weight status (underweight, normal weight, overweight, or obese), using a series of if-else statements.

### Step 9: Displaying the Results
```java
System.out.printf("Your BMI is: %.2f\n", bmi);
System.out.println("Interpretation: " + interpretation);
```
Here, we display the calculated BMI (formatted to two decimal places) and its interpretation to the user.

### Step 10: Closing the Scanner
```java
scanner.close();
```
Finally, we close the Scanner object to prevent potential memory leaks, a practice that ensures optimal performance in Java.
