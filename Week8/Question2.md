
### Step 1: Develop the Python Program
```python
def reverse_lines(input_file, output_file):
    with open(input_file, 'r') as file:
        lines = file.readlines()
    
    lines_reversed = lines[::-1]
    
    with open(output_file, 'w') as file:
        file.writelines(lines_reversed)

# Input file name
input_file = "question2.txt"

# Output file name
output_file = "reversed_question2.txt"

# Calling the function
reverse_lines(input_file, output_file)
```

### Step 2: Explanation

1. **Function Definition**
   - **`def reverse_lines(input_file, output_file):`**
     We define a function named `reverse_lines` which takes two arguments: `input_file` (the file to read from) and `output_file` (the file to write to).

2. **Reading the File**
   - **`with open(input_file, 'r') as file:`**
     We open the input file in read mode ('r') using a context manager (with statement), which ensures the file is closed automatically at the end of the block.
   - **`lines = file.readlines()`**
     We read all the lines from the file and store them in a list called `lines`.

3. **Reversing the Lines**
   - **`lines_reversed = lines[::-1]`**
     We create a new list called `lines_reversed` which contains all the lines from the `lines` list but in reversed order (this is achieved using slicing with a step of -1).

4. **Writing the Reversed Lines to a New File**
   - **`with open(output_file, 'w') as file:`**
     We open the output file in write mode ('w'), again using a context manager.
   - **`file.writelines(lines_reversed)`**
     We write the reversed lines to the output file using the `writelines` method.

5. **Calling the Function**
   - We specify the input file name (`"question2.txt"`) and the output file name (`"reversed_question2.txt"`) as strings.
   - **`reverse_lines(input_file, output_file)`**
     We call the `reverse_lines` function with the input and output file names as arguments.

### Step 3: Example Walkthrough
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

I hope this helps! Let me know if you have any further questions.
