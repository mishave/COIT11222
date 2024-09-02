### **Question Five:**
The transpose of a matrix is a new matrix obtained by interchanging its rows and columns. In other words, it flips the original matrix over its main diagonal (from the top-left corner to the bottom-right corner).

Write a Python function `transpose_matrix(matrix)` that takes a matrix represented as a nested list and returns its transpose.

### **Understanding Matrix Transposition:**

Given an original matrix `A` with dimensions **m x n**:
- The transpose of `A`, denoted as `A^T`, will have dimensions **n x m**.
- Each element `A[i][j]` in the original matrix becomes `A^T[j][i]` in the transposed matrix.

### **Task Breakdown:**

This task involves creating a function to transpose a matrix by swapping rows and columns. Let's break down the steps to implement the function.

---

### **Step 1: Determine the Dimensions of the Matrix**

To transpose a matrix, we need to understand its current dimensions:
- Retrieve the number of rows (`m`) and the number of columns (`n`) of the original matrix.

- The number of rows in the original matrix becomes the number of columns in the transposed matrix, and vice versa.

**Example Code:**

```python
def transpose_matrix(matrix):
    rows = len(matrix)  # Number of rows in the original matrix
    cols = len(matrix[0])  # Number of columns in the original matrix
```

### **Step 2: Initialize the Transposed Matrix**

Create a new matrix `transpose` with dimensions **n x m** filled with zeros or empty values initially. This matrix will store the transposed values.

- Initialize a nested list with `cols` rows and `rows` columns.

**Example Code:**

```python
    # Initialize the transposed matrix with dimensions n x m
    transpose = [[0 for _ in range(rows)] for _ in range(cols)]
```

### **Step 3: Populate the Transposed Matrix**

Using nested loops, iterate through the elements of the original matrix and assign each element to its transposed position in the new matrix.

- The outer loop iterates over the rows of the original matrix.
- The inner loop iterates over the columns of the original matrix.
- Assign the value of `matrix[i][j]` to `transpose[j][i]`.

**Example Code:**

```python
    # Populate the transposed matrix with the elements from the original matrix
    for i in range(rows):
        for j in range(cols):
            transpose[j][i] = matrix[i][j]
```

### **Step 4: Combine All Steps into One Function**

Here’s the complete function that combines all the steps:

```python
def transpose_matrix(matrix):
    rows = len(matrix)  # Number of rows in the original matrix
    cols = len(matrix[0])  # Number of columns in the original matrix
    
    # Initialize the transposed matrix with dimensions n x m
    transpose = [[0 for _ in range(rows)] for _ in range(cols)]
    
    # Populate the transposed matrix with the elements from the original matrix
    for i in range(rows):
        for j in range(cols):
            transpose[j][i] = matrix[i][j]
    
    return transpose
```

### **Example Usage:**

To test the function, use the following matrix:

```python
# Example matrix
A = [
    [1, 2, 3],
    [4, 5, 6]
]

# Get the transpose of the matrix
transpose_A = transpose_matrix(A)
print(transpose_A)  # Output should be [[1, 4], [2, 5], [3, 6]]
```

### **Expected Output:**

If you input the matrix as shown in the example, the output should be:

```
[[1, 4],
 [2, 5],
 [3, 6]]
```

### **Notes:**

- Make sure to handle matrices of different dimensions (e.g., square matrices, row vectors, and column vectors) to ensure your function works for any valid matrix input.
- Testing your function with various input matrices will help confirm that it behaves as expected for all cases.
