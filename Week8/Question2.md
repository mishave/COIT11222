### **Step 1: Read the File**
To start, you'll need to read the content of the original file. Python provides simple functions for file handling.

- Open the file in read mode using the `open()` function.
- Use the `readlines()` method to read all lines at once, which stores each line as an element in a list.

**Example Code:**

```python
with open("question2.txt", "r") as file:
    lines = file.readlines()  # This reads all lines into a list
```

### **Step 2: Reverse the List of Lines**
Once you have the lines in a list, the next step is to reverse their order.

- Use the `reverse()` method of the list to invert the order of its elements.

**Example Code:**

```python
lines.reverse()  # This reverses the list of lines in place
```

### **Step 3: Write the Reversed Lines to a New File**
After reversing the lines, you will write them to a new file. This involves opening (or creating) a new file and writing the lines to it.

- Open a new file in write mode.
- Use the `writelines()` method to write the reversed list of lines to the new file.

**Example Code:**

```python
with open("reversed_question2.txt", "w") as new_file:
    new_file.writelines(lines)  # Write the reversed lines to the new file
```

### **Step 4: Combine All Steps into One Program**
Here’s how the complete script will look after combining all the steps:

```python
# Open the original file and read lines
with open("question2.txt", "r") as file:
    lines = file.readlines()

# Reverse the list of lines
lines.reverse()

# Open a new file and write the reversed lines
with open("reversed_question2.txt", "w") as new_file:
    new_file.writelines(lines)
```

### **Expected Output:**
If we use the "question2.txt" file containing:

```
Line 1: This is the first line.
Line 2: This is the second line.
Line 3: This is the third line.
Line 4: This is the fourth line.
Line 5: This is the fifth line.
```

The program will create a new file "reversed_question2.txt" with the content:

```
Line 5: This is the fifth line.
Line 4: This is the fourth line.
Line 3: This is the third line.
Line 2: This is the second line.
Line 1: This is the first line.
```

### **Notes:**
- Ensure to always close files properly after operations are complete. Using the `with` statement as shown helps manage this by automatically closing the file once the block of code is exited.
