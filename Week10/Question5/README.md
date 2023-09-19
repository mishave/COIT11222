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


## Step-by-Step Explanation of code
Basic overview of structure in a Java program and how it compares to Python.

### 1. Importing a Package
```java
import java.util.Scanner;
```
In the first line, we are importing the Scanner class from the `java.util` package. This allows us to use the Scanner class to get inputs from the user. In Python, you didn't need to import a package to get inputs; you could just use the `input()` function.

### 2. Declaring a Public Class
```java
public class DayOfWeek {
```
Next, we define a public class named `DayOfWeek`. In Java, every program must have at least one class and one main method (which we will see next). This is a bit different from Python where you can have a standalone script without a class.

### 3. Main Method
```java
public static void main(String[] args) {
```
This line declares the main method, where the execution of the program starts. The keywords `public` and `static` are access modifiers that dictate how and where this method can be accessed from. The `void` keyword indicates that this method does not return any value.

### 4. Creating a Scanner Object
```java
Scanner input = new Scanner(System.in);
```
Here, we create an object of the Scanner class named `input`, which is used to read the input from the user (similar to `input()` in Python).

### 5. Prompting the User
```java
System.out.print("Enter a number (1-7): ");
```
This line displays a message prompting the user to enter a number. This is similar to using the `print()` function in Python.

### 6. Reading the Input
```java
int day_number = input.nextInt();
```
In this step, the program reads the number entered by the user and stores it in the variable `day_number`. This is similar to assigning a value to a variable in Python with an assignment statement.

### 7. Conditional Statements
```java
String day;
if (day_number == 1) {
    day = "Sunday";
} else if (day_number == 2) {
    // ... (similar blocks for other days)
} else {
    day = "Invalid day number";
}
```
This segment contains a series of if-else statements that assign a day of the week to the `day` variable based on the value of `day_number`. This is similar to using if-elif-else statements in Python.

### 8. Displaying the Result
```java
System.out.println("Day of the week: " + day);
```
This line displays the resulting day of the week. The `+` operator is used to concatenate the string "Day of the week: " with the value of the `day` variable. This is similar to using the `print()` function in Python.

### 9. Closing the Scanner
```java
input.close();
```
Finally, we close the Scanner object to prevent potential memory leaks. This is a good practice in Java, though you haven't encountered a similar step in Python.
