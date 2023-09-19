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
In Jave although the syntax is different, many concepts are quite similar to what you have learned in Python, such as getting inputs, using conditional statements, and displaying outputs. 

### Step 1: Importing a Package
```java
import java.util.Scanner;
```
The first line of the program imports the Scanner class from the `java.util` package. This class helps us to read the input given by the user, similar to how we used `input()` in Python.

### Step 2: Declaring a Public Class
```java
public class GradeCalculator {
```
Here, we are declaring a class named `GradeCalculator`. This class encapsulates all the data and methods that our program will use.

### Step 3: Main Method
```java
public static void main(String[] args) {
```
Every Java application starts with a main method. It's the entry point of our application and kicks off the execution of the program.

### Step 4: Creating a Scanner Object
```java
Scanner scanner = new Scanner(System.in);
```
We create an instance of the Scanner class, named `scanner`, to read input values from the user.

### Step 5: Getting User Inputs
```java
System.out.print("Enter student ID: ");
String student_id = scanner.nextLine();

System.out.print("Enter student last name: ");
String last_name = scanner.nextLine();
```
We prompt the user to enter the student ID and the last name, storing these inputs in respective variables.

### Step 6: Getting Assignment Marks
```java
System.out.print("Enter mark for Assignment 1 (out of 25): ");
int assignment1_mark = scanner.nextInt();

System.out.print("Enter mark for Assignment 2 (out of 25): ");
int assignment2_mark = scanner.nextInt();

System.out.print("Enter mark for Assignment 3 (out of 50): ");
int assignment3_mark = scanner.nextInt();
```
Similarly, we prompt the user to input the marks for three assignments and store them in variables.

### Step 7: Calculating the Total Mark
```java
int total_mark = assignment1_mark + assignment2_mark + assignment3_mark;
```
We calculate the total mark by adding the marks of all three assignments.

### Step 8: Determining the Grade
```java
String frmt_string;
if (total_mark < 0 || total_mark > 100) {
    frmt_string = "Invalid data entry. Total mark must be between 0 and 100. Total = "+total_mark;
} else if (total_mark < 50) {
    frmt_string =  String.format("%s %s %d f", student_id, last_name,total_mark);
    // ... (similar blocks for other grade thresholds)
} else {
    frmt_string =  String.format("%s %s %d HD", student_id, last_name,total_mark);
}
```
In this section, we determine the grade based on the total mark using a series of if-else statements. Depending on the range in which the total mark falls, a formatted string is created which includes the student ID, last name, total mark, and the grade.

### Step 9: Displaying the Output
```java
System.out.println(frmt_string);
```
Here, we display the formatted string, which includes all the necessary information and the grade.

### Step 10: Closing the Scanner
```java
scanner.close();
```
Lastly, we close the Scanner object to prevent potential memory leaks, which is a good practice in Java.
