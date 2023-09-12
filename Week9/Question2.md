# Calc values based on txt file

This script calculates the average of numbers read from a file named "numbers.txt". It is designed to handle potential errors that might occur during file operations gracefully.
```python
file_path = "numbers.txt"
try:
    sum = 0
    n = 0
    with open(file_path, 'r') as file:
        for line in file:
            line = line.strip()
            try:
                sum = sum + int(line)
                n = n + 1
            except ValueError:
                pass
    print("Average: {:.3f}".format(sum/n))
except FileNotFoundError:
    print("File: {} deosnot exist.".format(file_path))
```
**You will need to add a txt file with numbers on each line**
```txt
1
2
3
4
five
5
six
6
seven
8
9
ten
10
```
## Code Breakdown

### Initialising the File Path

```python
file_path = "numbers.txt"
```

**Explanation**: 
This line assigns the string "numbers.txt" to the variable `file_path`, indicating the name of the file to be read.

---

### Beginning the Try Block

```python
try:
```

**Explanation**: 
The script starts a `try` block here to encompass code that might raise exceptions, which will be caught by subsequent `except` blocks.

---

### Variable Initialisation

```python
    sum = 0
    n = 0
```

**Explanation**: 
Here, two variables, `sum` and `n`, are initialised to zero to store the cumulative sum of numbers and the count of valid number lines read from the file, respectively.

---

### Opening the File

```python
    with open(file_path, 'r') as file:
```

**Explanation**: 
This line utilises a `with` statement to open the file indicated by `file_path` in read mode ('r'), ensuring that the file is closed automatically after operations, even if errors occur within the block.

---

### Loop to Read Lines from the File

```python
        for line in file:
            line = line.strip()
```

**Explanation**: 
Within the `with` block, a `for` loop iterates over each line in the file. The `strip()` method removes whitespace from the start and end of each line, preparing it for further processing.

---

### Inner Try Block for Value Conversion

```python
            try:
                sum = sum + int(line)
                n = n + 1
```

**Explanation**: 
An inner `try` block begins here, attempting to convert the stripped line to an integer and add it to the cumulative sum. If successful, the count of numbers (`n`) is incremented by one.

---

### Handling Value Conversion Errors

```python
            except ValueError:
                pass
```

**Explanation**: 
In case of a `ValueError` (when the line cannot be converted to an integer), this segment catches the exception and uses the `pass` statement to ignore the error, proceeding to the next iteration of the loop.

---

### Calculating and Displaying the Average

```python
    print("Average: {:.3f}".format(sum/n))
```

**Explanation**: 
After the loop concludes, the script computes the average of the numbers by dividing the sum by `n`. The resultant average, rounded to three decimal places, is then printed to the console.

---

### Handling File Not Found Error

```python
except FileNotFoundError:
    print("File: {} does not exist.".format(file_path))
```

**Explanation**: 
If the script encounters a `FileNotFoundError` (meaning the file specified by `file_path` could not be found), this block catches the exception and displays a message indicating the absence of the file.

---
