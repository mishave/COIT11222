
# Detailed Explanation of the transpose_matrix Function

This Python function called `transpose_matrix`, computes the transpose of a given matrix. The transpose of a matrix is a new matrix obtained by interchanging its rows and columns. In other words, it flips the original matrix over its main diagonal.

```python
def transpose_matrix(matrix):
    # Get the dimensions of the original matrix
    rows = len(matrix)
    cols = len(matrix[0])
```

Explanation:
- `def transpose_matrix(matrix):` defines a new function named `transpose_matrix` that takes one parameter, `matrix`, which is the matrix to be transposed.
- `rows = len(matrix)` calculates the number of rows in the original matrix by getting the length of the list representing the matrix.
- `cols = len(matrix[0])` calculates the number of columns in the original matrix by getting the length of the first row (list) in the matrix.

```python
    # Create an empty matrix with swapped dimensions (cols x rows)
    transpose = []
    for j in range(cols):
        transpose.append([0] * rows)
```

Explanation:
- `transpose = []` initializes an empty list to store the transpose of the original matrix.
- The `for` loop iterates over the range of columns in the original matrix.
- Inside the loop, `transpose.append([0] * rows)` adds a new row to the `transpose` matrix, initializing it with zeros. The number of rows in the transposed matrix is equal to the number of columns in the original matrix.

```python
    # Populate the transpose matrix
    for i in range(rows):
        for j in range(cols):
            transpose[j][i] = matrix[i][j]
    return transpose
```

Explanation:
- These lines populate the transposed matrix with the appropriate values from the original matrix.
- The nested `for` loop iterates over each element in the original matrix.
- Inside the nested loop, `transpose[j][i] = matrix[i][j]` assigns the value from the original matrix to the corresponding position in the transposed matrix, effectively swapping the row and column indices.
- Finally, `return transpose` returns the transposed matrix.

```python
# Example matrix
original_matrix = [
    [1, 2, 3],
    [4, 5, 6]
]

# Calculate the transpose
transposed_matrix = transpose_matrix(original_matrix)

# Print the original and transposed matrices
print("Original Matrix:")
for row in original_matrix:
    print(row)

print("\nTransposed Matrix:")
for row in transposed_matrix:
    print(row)
```

Explanation:
- An example matrix `original_matrix` is defined.
- `transposed_matrix = transpose_matrix(original_matrix)` calls the `transpose_matrix` function with `original_matrix` as the argument, and stores the result in `transposed_matrix`.
- The subsequent lines of code print the original matrix and the transposed matrix to the console, to visually confirm the function's operation.
