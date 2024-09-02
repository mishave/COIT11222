# Beginner Programming Task: Matrix Multiplication Function

### **Question Four:**
Write a Python function called `matrix_mul(A, B)` that performs matrix multiplication. The function takes two matrices, `A` and `B`, as input and returns a third matrix, `C`, which stores the result of the multiplication. 

### **Matrix Multiplication Rules:**
Before performing the multiplication, the function must check if the two matrices are conformable for multiplication. Two matrices are conformable for multiplication when the number of columns in the first matrix (often referred to as matrix `A`) is equal to the number of rows in the second matrix (`B`).

#### **Conditions for Matrix Multiplication:**
- Matrix `A` has dimensions **m x n**, meaning it has `m` rows and `n` columns.
- Matrix `B` has dimensions **n x p**, meaning it has `n` rows and `p` columns.
- The result of this multiplication will be a new matrix `C` with dimensions **m x p**.

### **Task Breakdown:**

This task involves checking matrix dimensions for conformability, performing the multiplication, and handling potential errors. Let's break it down step-by-step.

---

### **Step 1: Check Matrix Conformability**

Before multiplying two matrices, ensure that the number of columns in matrix `A` is equal to the number of rows in matrix `B`.

- Retrieve the dimensions of matrices `A` and `B`.
- Verify if the matrices are conformable. If they are not, return an error message.

**Example Code:**

```python
def matrix_mul(A, B):
    # Get the dimensions of matrix A and matrix B
    rows_A = len(A)
    cols_A = len(A[0])
    rows_B = len(B)
    cols_B = len(B[0])
    
    # Check if matrices A and B are conformable for multiplication
    if cols_A != rows_B:
        return "Error: Matrices are not conformable for multiplication."
```

### **Step 2: Initialize the Result Matrix**

If the matrices are conformable, proceed to initialize the result matrix `C`.

- Matrix `C` should have dimensions **m x p** (where `m` is the number of rows in `A` and `p` is the number of columns in `B`).
- Initialize `C` with zeros.

**Example Code:**

```python
    # Initialize the resulting matrix C with zeros
    C = [[0 for _ in range(cols_B)] for _ in range(rows_A)]
```

### **Step 3: Perform Matrix Multiplication**

Use nested loops to compute the product of matrix `A` and matrix `B`.

- The outer loop iterates over the rows of matrix `A`.
- The middle loop iterates over the columns of matrix `B`.
- The inner loop computes the dot product for each element in matrix `C`.

**Example Code:**

```python
    # Perform matrix multiplication
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A):  # or k in range(rows_B)
                C[i][j] += A[i][k] * B[k][j]
    
    return C
```

### **Step 4: Combine All Steps into One Function**

Here’s the complete function that combines all the steps:

```python
def matrix_mul(A, B):
    # Get the dimensions of matrix A and matrix B
    rows_A = len(A)
    cols_A = len(A[0])
    rows_B = len(B)
    cols_B = len(B[0])
    
    # Check if matrices A and B are conformable for multiplication
    if cols_A != rows_B:
        return "Error: Matrices are not conformable for multiplication."

    # Initialize the resulting matrix C with zeros
    C = [[0 for _ in range(cols_B)] for _ in range(rows_A)]
    
    # Perform matrix multiplication
    for i in range(rows_A):
        for j in range(cols_B):
            for k in range(cols_A):  # or k in range(rows_B)
                C[i][j] += A[i][k] * B[k][j]
    
    return C
```

### **Example Usage:**

To test the function, use the following matrices:

```python
# Example matrices
A = [
    [1, 2, 3],
    [4, 5, 6]
]

B = [
    [7, 8],
    [9, 10],
    [11, 12]
]

# Perform matrix multiplication
result = matrix_mul(A, B)
print(result)  # Output should be [[58, 64], [139, 154]]
```

### **Expected Output:**

If you input the matrices as shown in the example:

```
[[58, 64],
 [139, 154]]
```

### **Notes:**

- Ensure your function checks the matrix dimensions correctly and handles cases where matrices cannot be multiplied.
- Test the function with matrices of various dimensions to confirm it works properly in all conformable and non-conformable scenarios.
- The `with` statement is not required here since we're not handling file operations, but make sure your matrix handling logic is robust and efficient.
