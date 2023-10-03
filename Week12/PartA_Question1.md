### Question 1

**What are the key distinctions among runtime, syntax, and semantic errors in programming?**

- **Syntax Errors:** These are errors that occur when the programmer violates the rules of the programming language. The code will not run until these errors are fixed. For instance, forgetting to close a parenthesis or not ending a statement with a semicolon in some languages.
  
- **Runtime Errors:** These are errors that occur during the execution of a program. The code may be syntactically correct, but due to some unforeseen conditions (like trying to divide by zero or accessing an out-of-bounds array index), the program crashes or exits unexpectedly.
  
- **Semantic Errors:** These are the trickiest errors. The code runs and there is no crash, but the output is not what the programmer expected. This usually means that there is a logical flaw in the program. For instance, using the wrong variable or misunderstanding how a function works.

**Please review the 'word_match()' function provided below.**

```python
def word_match(words, word):
    index = -1
    for (i, item) in enumerate(words):
        if item != word:
            i = index
            break
    return i
```

### Explanation:

**Function Definition**

```python
def word_match(words, word):
```

This line starts the definition of a function named `word_match`. This function takes in two parameters:

- `words`: A list of words (or items).
- `word`: A single word (or item) that you want to find in the `words` list.

**Initialise the Index**

```python
    index = -1
```

Here, a variable named `index` is set to `-1`. This is a common practice to indicate that, initially, the `word` is not found in the `words` list. If the `word` isn't found by the end of the function, `-1` will be returned, signaling that the word doesn't exist in the list.

**Loop through the List**

```python
    for (i, item) in enumerate(words):
```

This line starts a loop that goes through each `item` in the `words` list. The `enumerate` function is used to get both the position (`i`) and the value (`item`) of each word in the `words` list.

**Check for a Non-Match**

```python
        if item != word:
```

Here, the code checks if the current `item` in the list is NOT equal to the `word` we're looking for.

**If Non-Match Found**

```python
            i = index
            break
```

If the current `item` is not the `word` we're looking for, the function sets `i` to `-1` (the value of `index`). Then, it breaks out of the loop immediately. This means the function stops looking for the word as soon as it finds a word that doesn't match, which isn't typically the desired behavior.

**Return the Result**

```python
    return i
```

Finally, the function returns the value of `i`. If the word was found, it would return its position. If not, it would return `-1`, but due to the previous logic, it will always return `-1` unless the word you're looking for is the first item in the list.


**(a) Does this function contain an error? If there is an error, could you identify the type of error and suggest how to rectify it?**

Yes, the function contains a semantic error. The logic in the loop is supposed to find a match, but instead, it breaks the loop if the word doesn't match. This is not the intended behavior. To rectify it, the condition should be changed from `if item != word:` to `if item == word:`.

**(b) Rewrite the word_match() function, correcting any errors if they exist.**

Here's the corrected function:

```python
def word_match(words, word):
    index = -1
    for (i, item) in enumerate(words):
        if item == word:
            return i
    return index
```

**(c) Test the word_match() function by performing the following steps:**

```python
# Create a list
words = ["Jim", "Adam", "Camaroon", "Flintof"]

# Call the word_match function
index = word_match(words, "Camaroon")

# Print the value of the variable index
print(index)
```

**(d) What test cases would you employ to thoroughly test your word_match() function?**

1. Test with a word that is in the list.
2. Test with a word that is not in the list.
3. Test with an empty list.
4. Test with a list containing duplicate words.
5. Test with different types of strings (uppercase, lowercase, mixed-case, strings with spaces or special characters).
6. Test with a large list to check for efficiency.




## Additional context:
### What is `enumerate()`?

`enumerate()` is a built-in Python function that allows you to loop through items in a list (or other iterable objects) while also getting the index (position) of the current item, in addition to its value.

### How does it work?

When you use `enumerate()`, it returns pairs of data for each item in your list. The first item of the pair is the index (i.e., the position) and the second is the value.

For example, if you have a list `['a', 'b', 'c']`, `enumerate()` would process it like this:

- First pass: `0, 'a'` (0 is the index, 'a' is the value)
- Second pass: `1, 'b'`
- Third pass: `2, 'c'`

### Code Breakdown:

In the code snippet:

```python
for (i, item) in enumerate(words):
```

- `enumerate(words)` processes the `words` list.
- `(i, item)` captures the output from `enumerate()`. 
  - `i` captures the index (the position in the list).
  - `item` captures the value (the actual word from the list).

So, as you loop through `words` with `enumerate()`, `i` gives you the position of the current word, and `item` gives you the word itself.

### Why use `enumerate()`?

There are many ways to loop through items in a list in Python. One common way is to just get each value:

```python
for item in words:
```

But what if you also want to know the position of `item` in `words`? That's when `enumerate()` is very handy. It saves you from having to manually keep track of the index, making the code cleaner and more Pythonic.

### In Summary:

Whenever you see `enumerate()` in Python, think: "Ah, this is looping through items and also tracking their positions in the list!"