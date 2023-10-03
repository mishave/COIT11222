### Question 3

**(a) Discussing Scopes in Python:**

- **Local Scope**: Refers to variables defined inside a function. These variables are only accessible within that function and not outside it. If you try to access a local variable outside its function, you'll get an error.
  
- **Global Scope**: Refers to variables defined outside any function, at the top level of the Python script. These variables can be accessed from any function within the script, but to modify them inside a function, you need to use the `global` keyword.
  
- **Built-in Scope**: Refers to names that are always available in Python, such as `print`, `len`, and other built-in functions and exceptions. It's a good practice not to overwrite these built-in names with custom variables or functions.

**Output of the given code**:

Given:
```
n = 3
m = 5
def fun(n):
    m = -5
    return 3*n+m
print(fun(2),n,m)
```

The function `fun` is called with `2` as its argument. Inside the function, `m` is locally assigned a value of `-5`. Thus, the function returns \(3 \times 2 - 5 = 1\). The global variables `n` and `m` remain unchanged.

Output:
```
1 3 5
```

**(b) Discussing “Pass by Object Reference” in Python**:

In Python, all arguments are passed by object reference. This means that when you pass a variable to a function, you're actually passing a reference to the object the variable refers to, not a fresh copy of the object. 

For mutable objects (like lists), changes made inside the function reflect outside the function. For immutable objects (like strings, numbers, and tuples), changes made inside the function won't reflect outside since a new local reference is created.

**Predicting the Output**:

Given the code, let's walk through the output:
Before calling the `update` function, the values of `i, f, s, l, t` are printed. However, the variable `i` is not defined in the global scope, so this will raise a `NameError`. Assuming this error is corrected by defining a global `i`, here's the expected output:

```
Before update function i: [global value of i], f: 5.5, s: Hello World!, l: [1, 2, 3, 4], t: (1, -1, 2, 5)
Inside Update function i: 20, f: -9.5, s: Good bye!!, l: [1, 5, 3, 4], t: (2, 2)
After update function i: [global value of i], f: 5.5, s: Hello World!, l: [1, 5, 3, 4], t: (1, -1, 2, 5)
```

Notice that the list `l` is modified inside the function, and the change is reflected outside. However, the other variables (except `i`, which would depend on its global value) remain unchanged outside the function since they're either reassigned inside the function (changing the local reference) or are immutable.
