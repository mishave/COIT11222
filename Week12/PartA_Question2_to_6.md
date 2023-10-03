### Question 2

**Understanding Parameter Passing in Python**

In Python, parameter passing is “pass by object reference”. Key things to remember:

- **Mutable vs. Immutable:** In Python, objects are categorised into mutable and immutable types. Mutable objects can be changed after they are created, while immutable objects cannot. Examples of mutable objects are lists, dictionaries, and sets. Examples of immutable objects are integers, strings, and tuples.

- **Everything is an Object:** Each object, whether it's a number, string, or list, has a type and a value.
  
- **Object Reference:** Creating an object, like a list, gives you a reference to that object.
  
- **Passing by Value (of References):** When an argument is passed to a function, the reference is passed by value. This means a copy of the reference is given to the function.
  
- **Modifying vs. Reassigning:** You can modify the object inside the function, but reassigning the reference won't change the original reference outside the function.

For immutable objects, behavior is like pass-by-value, but for mutable objects, modifications are visible outside, appearing like pass-by-reference.


**(a) What is the output by the following code?**

```python
def swap(a,b):
    temp = a
    a = b
    b = temp
a = 10
b = 20    
print("Before swap")
print("a: {}, b:{}".format(a,b))
swap(a,b)
print("After swap")
print("a: {}, b:{}".format(a,b))
```

The output will be:
```
Before swap
a: 10, b: 20
After swap
a: 10, b: 20
```

**(b) Explanation:** The swap method does not work because integers are immutable. The references to `a` and `b` are passed to the function, but the reassignment inside the function is local and does not affect the original variables.

**(c) Output with a list:**

```python
def swap(lst):
    temp = lst[0]
    lst[0] = lst[1]
    lst[1] = temp
a = 10
b = 20    
lst = [a, b]
print("Before swap")
print("a: {}, b:{}".format(a,b))
swap(lst)
a = lst[0]
b = lst[1]
print("After swap")
print("a: {}, b:{}".format(a,b))
```

The output will be:
```
Before swap
a: 10, b: 20
After swap
a: 20, b: 10
```

**(d) Explanation:** Lists are mutable. The function modifies the list directly, which reflects outside the function, thus achieving the swap.

---

### Question 3

**Understanding Scopes in Python**

Three important scopes:
1. Local scope
2. Global scope 
3. Built-in scope

Predict the output of the code below and understand the scopes:

```python
i = 6
f = 5.5
s = "Hello World!"
l = [1, 2, 3, 4]
t = (1, -1, 2, 5) 

def update(i, f, s, l, t):
    i = 20
    f = -9.5
    s = "Good bye!!"
    l[1] = 5
    t = (2, 2)
    print("Inside Update function i: {}, f: {}, s: {}, l: {}, t: {}".format(i,f,s,l,t))
 
print("Before update function i: {}, f: {}, s: {}, l: {}, t: {}".format(i,f,s,l,t)) 
update(i, f, s, l, t)
print("After update function i: {}, f: {}, s: {}, l: {}, t: {}".format(i,f,s,l,t)) 
```

**Output:**

```
Before update function i: 6, f: 5.5, s: Hello World!, l: [1, 2, 3, 4], t: (1, -1, 2, 5)
Inside Update function i: 20, f: -9.5, s: Good bye!!, l: [1, 5, 3, 4], t: (2, 2)
After update function i: 6, f: 5.5, s: Hello World!, l: [1, 5, 3, 4], t: (1, -1, 2, 5)
```

The values of `i`, `f`, and `s` remain unchanged outside the function, while the list `l` is modified due to its mutability.

---

### Question 4

This question tests the understanding of functions modifying lists:

```python
def function1(lst, index, item):
    lst.insert(index, item)

def function2(lst, item):
    lst.append(item)

def function3(lst):
    del lst[-1]

lst = [5, 6, 7, 8]

#(a) 
function1(lst, 2, 9)
print(lst)  # Output: [5, 6, 9, 7, 8]

#(b)
function2(lst, 10)
print(lst)  # Output: [5, 6, 9, 7, 8, 10]

#(c)
function3(lst)
print(lst)  # Output: [5, 6, 9, 7, 8]
```

---

### Question 5

**(a) Output for the code:**

If the user enters 3:

```
What year are you in? 3
You are a junior
```

---

### Question 6

This question tests understanding of matrix traversal:

```python
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
n = len(matrix)
m = len(matrix[0])
for row in range(m):  
    for column in range(n):  
        print(matrix[row][column])
```

**Output:**

```
1
2
3
4
5
6
7
8
9
```

The nested loops traverse the matrix row by row, printing each element.

