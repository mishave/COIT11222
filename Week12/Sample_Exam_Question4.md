### Question 4

**(a) Pseudocode to Find Common Elements in Two Sorted Lists:**

```
Initialize two pointers, pointerA and pointerB, to the start of ListA and ListB respectively.
Create an empty list, CommonElements.

WHILE pointerA is not at the end of ListA AND pointerB is not at the end of ListB:
    IF ListA[pointerA] is equal to ListB[pointerB]:
        Add ListA[pointerA] to CommonElements.
        Increment pointerA by 1.
        Increment pointerB by 1.
    ELSE IF ListA[pointerA] is less than ListB[pointerB]:
        Increment pointerA by 1.
    ELSE:
        Increment pointerB by 1.

RETURN CommonElements.
```

This approach uses two pointers to traverse through the sorted lists, avoiding the need for nested loops and providing an efficient way to find common elements.

**(b) Pseudocode for Searching an Item in a Sorted List (Binary Search):**

```
Define FUNCTION BinarySearch(List, item) RETURNS boolean:
    Set low to 0.
    Set high to the length of List minus 1.

    WHILE low is less than or equal to high:
        Set mid to (low + high) divided by 2 (integer division).

        IF List[mid] is equal to item:
            RETURN True.
        ELSE IF List[mid] is less than item:
            Set low to mid + 1.
        ELSE:
            Set high to mid - 1.

    RETURN False.
```

Binary search is an efficient algorithm to find an item in a sorted list. It divides the list in half with each iteration, reducing the search space significantly and providing a logarithmic time complexity.