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
