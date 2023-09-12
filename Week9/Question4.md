# Question Four: Detailed Explanation

This section offers an in-depth explanation of the Python script contained in the "exception_handler_lookup.py" file. In this script, there are three functions (`function_a`, `function_b`, and `function_c`) that demonstrate how Python associates exception handlers with various exceptions, especially when making function calls.

## Understanding the Code Structure

### Function: function_c

```python
def function_c(a, b):
    if b == 0:
        raise ZeroDivisionError()
    else:
        result = a / b
        print("Result:", result)
```

**Explanation**:
This function takes two parameters, `a` and `b`. It checks if `b` is zero and, if so, raises a `ZeroDivisionError`. Otherwise, it divides `a` by `b` and prints the result. This function does not handle any exceptions; it merely raises an exception if a specific condition (division by zero) is met.

---

### Function: function_b

```python
def function_b(a, b):
    try:
        function_c(a, b)
    except TypeError:
        print("TypeError handler in function_b")
```

**Explanation**:
This function also takes two parameters, `a` and `b`, and calls `function_c` within a try block. It catches any `TypeError` exceptions that might occur during the call to `function_c`. If a `TypeError` is raised, it prints a custom error message.

---

### Function: function_a

```python
def function_a(a, b):
    try:
        function_b(a, b)
    except ZeroDivisionError:
        print("Division by zero not allowed.")
```

**Explanation**:
Similarly, this function takes two parameters and calls `function_b` within a try block. It catches any `ZeroDivisionError` exceptions that might occur during the call to `function_b`. If a `ZeroDivisionError` is raised, it prints a custom error message.

---

### Main Script Execution

```python
function_a(1, 0)
#function_a("Hello", 1)
```

**Explanation**:
In the main part of the script, `function_a` is called with different sets of arguments to demonstrate how the nested exception handling works. Initially, it is called with arguments 1 and 0, which will eventually lead to a `ZeroDivisionError` in `function_c`.

---

## Running the Script with Different Inputs

### Scenario 1: function_a(1, 0)

When `function_a(1, 0)` is executed:
1. `function_a` calls `function_b` with the arguments 1 and 0.
2. `function_b` calls `function_c` with the arguments 1 and 0.
3. Inside `function_c`, since `b` is zero, a `ZeroDivisionError` is raised.
4. This exception is not caught in `function_b` (as it only catches `TypeError`), so it propagates back to `function_a`.
5. `function_a` catches the `ZeroDivisionError` and prints "Division by zero not allowed."

### Scenario 2: function_a("Hello", 1)

When `function_a("Hello", 1)` is executed:
1. `function_a` calls `function_b` with the arguments "Hello" and 1.
2. `function_b` calls `function_c` with the arguments "Hello" and 1.
3. Inside `function_c`, an attempt is made to divide "Hello" by 1, which raises a `TypeError`.
4. This exception is caught by the `except` block in `function_b`, which prints "TypeError handler in function_b."
