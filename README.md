# COIT11222

In Java, an exception is an event that disrupts the normal flow of the program's instructions. When an error occurs within a method, the method creates an exception object and hands it off to the runtime system. This process is called "throwing an exception". Here, I'll explain the concept of "throwing an exception" in a way that is suitable for students who are learning Java:

### Understanding Exceptions

1. **What is an Exception?**
   - An exception is like a signal that indicates that something unexpected or erroneous has occurred while the program was running. It is represented as an object in Java.

2. **Throwing an Exception**
   - When a problem occurs in your code, you can "throw" an exception to indicate that something went wrong. This is done using the `throw` keyword followed by an instance of the exception.

3. **Exception Class Hierarchy**
   - In Java, exceptions are classified into two categories: checked exceptions and unchecked exceptions. The `Exception` class is the parent class of all checked exceptions, and the `RuntimeException` class, which extends `Exception`, is the parent class of all unchecked exceptions.

### Example Code

Here is a simple example to demonstrate throwing an exception:

```java
public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18");
        } else {
            System.out.println("Age is 18 or greater");
        }
    }
}
```

### Explanation of the Example

1. **Defining a Method that Throws an Exception**
   - In the `checkAge` method, we have mentioned that it `throws Exception`. This means that this method might throw an exception of type `Exception` or any of its subclasses.
   
2. **Throwing an Exception**
   - Inside the `checkAge` method, we check if the age is less than 18. If it is, we throw a new exception with the message "Age is less than 18".

3. **Catching the Exception**
   - In the `main` method, we have a try-catch block. We call the `checkAge` method inside the try block, and if an exception is thrown, we catch it in the catch block and print the message of the exception.

### Key Takeaways for Students

1. **Identifying Problems**: Use exceptions to handle unexpected situations or errors in your code.
   
2. **Creating and Throwing Exceptions**: You can create an exception object and throw it using the `throw` keyword to indicate an error condition.

3. **Handling Exceptions**: Use try-catch blocks to handle exceptions gracefully, preventing your program from crashing and allowing you to take appropriate actions when an error occurs.

I hope this helps! Let me know if you have any further questions.