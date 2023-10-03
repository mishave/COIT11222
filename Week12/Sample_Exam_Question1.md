## Sample Exam Answers:

### Question 1

**(a) Debugging in Programming:**

Debugging refers to the process of identifying, diagnosing, and correcting errors (or "bugs") in a program. It involves systematically narrowing down the location of the error and determining its cause, often using tools like debuggers, print statements, or logging.

**(b) Distinctions Among Runtime, Syntax, and Semantic Errors:**

- **Syntax Errors**: These are errors where the code does not conform to the language's grammar rules. The program will not start because of these errors. Example: Forgetting a colon at the end of a function definition in Python.
  
- **Runtime Errors**: These errors occur during the program's execution. They are detected only when a particular code path is executed. Example: Trying to divide by zero.
  
- **Semantic Errors**: The code runs and finishes without crashing, but doesn't produce the intended result. These are logical errors in your program. Example: Writing a sorting algorithm that doesn't sort correctly.

**(c) Comments in Programming:**

Comments are lines in the program that are not executed and are used to provide explanations or annotations about the code. Their benefits include:
- Improving code readability.
- Explaining complex pieces of code.
- Helping other developers understand the code's purpose.

**(d) Fundamental Steps in Python's Execution Process:**

1. **Lexical Analysis**: The source code is converted into tokens.
2. **Syntax Analysis**: Tokens are converted into a parse tree based on grammar rules.
3. **Semantic Analysis**: Checks the parse tree for semantic consistency with the language definition.
4. **Bytecode Generation**: Produces a low-level, platform-independent representation of the source code.
5. **Python Virtual Machine (PVM)**: Interprets the bytecode and executes it.

**(e) Output of Arithmetic Expressions:**

- \(2 \times 5 / 2 + 5 - 10\): `5.0`
- \((5 - 2)^2 \times 6\): `54`
- \((2 + 2 - 4) \times 1000 / 2\): `0.0`
- \((6 + 6 \times 6)^2^2\): `20736`

**(f) 'Instance Parameter' in a Class Method:**

The 'instance parameter' (commonly named `self` in Python) refers to the specific instance of the class being used. It gives methods access to the attributes and other methods of the same object, allowing us to retrieve or set instance-specific data.

**(g) Short Circuit Evaluation:**

Short circuit evaluation in Python refers to the interpreter's tactic of stopping the evaluation of a boolean expression as soon as its result is known. For `a = 0` and `b = 5`:

- \(a \geq 0 \text{ and } b == 5\): `True`
- \(a < 0 \text{ or } b == 5\): `True`

**(h) Determine Number of Elements in List 'a':**

You can use the `len()` function to determine the number of elements in a list. For `a = [3, 5, 6, 7]`, `len(a)` will return `4`.

**(i) Special Class Methods in Python:**

Special class methods (or "magic methods") in Python are methods with double underscores before and after their names. They allow developers to implement and customize default behaviors for built-in operations. Examples include `__init__`, `__str__`, and `__eq__`.

**(j) Purpose of Special Class Methods:**

- `__str__()`: Returns a user-friendly string representation of the object when using print or str.
- `__eq__()`: Allows custom behavior for the equality (`==`) operator.
- `__lt__()`: Used for the "less than" (`<`) comparison.
- `__gt__()`: Used for the "greater than" (`>`) comparison.

