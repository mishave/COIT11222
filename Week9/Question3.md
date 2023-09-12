# Question Three: Detailed Explanation

This section provides a detailed explanation of the Python application developed during week 8, which is structured into two distinct modules: `main.py` and `book.py`. The application reads book data from a file, allows the user to add new book entries, and writes the updated data to a new file.

## Module: book.py

### Class Definition

```python
class Book:
```

**Explanation**:
The `book.py` module defines a class named `Book` which represents a book object with specific attributes: title, author, and publication year.

### Initialisation Method

```python
    def __init__(self, title, author, publication_year):
        self.title = title
        self.author = author
        self.publication_year = publication_year
```

**Explanation**:
The `__init__` method is the constructor for the `Book` class. It takes three parameters: title, author, and publication year, and assigns them to instance variables.

### String Representation Method

```python
    def __str__(self):
        return "{} by {}, published in {}".format(self.title, self.author, self.publication_year)
```

**Explanation**:
The `__str__` method defines how a `Book` object should be represented as a string, which is useful for printing descriptive information about the book object.

### Equality Comparison Method

```python
    def __eq__(self, other):
        if isinstance(other, Book):
            return (self.title == other.title and self.author == other.author 
                    and self.publication_year == other.publication_year)
        return False
```

**Explanation**:
The `__eq__` method defines the criteria for comparing two `Book` objects for equality based on their attributes.

---

## Module: main.py

### Importing the Book Class

```python
from book import Book
```

**Explanation**:
At the beginning of the `main.py` module, the `Book` class from the `book.py` module is imported, allowing its use within `main.py`.

### Writing to File Function

```python
def write_file(lst, file_path):
    with open(file_path, "w") as file:
        for book in lst:
            file.write("{}| {}| {}\\n".format(book.title, 
                                                book.author, 
                                                book.publication_year))
```

**Explanation**:
The `write_file` function takes a list of `Book` objects and a file path as parameters. It writes the details of each book in the list to the specified file in a specific format.

### Reading from File Function

```python
def read_file(lst, file_path):
    try:
        with open(file_path, "r") as file:
            for line in file:
                line = line.strip()
                values = line.split("|")
                title = values[0].strip()
                author = values[1].strip()
                publication_year = int(values[2].strip())
                lst.append(Book(title, author, publication_year))
    except FileNotFoundError:
        print("{}: File does not exist.".format(file_path))
```

**Explanation**:
The `read_file` function attempts to read book data from the specified file and add it to the list of books passed as a parameter. If the file does not exist, it catches the `FileNotFoundError` and prints a custom error message.

### Main Section of the Script

```python
# Main section of the script starts here
file_name = "books.txt"
file_name1 = "books1.txt"
book_list = []

try:
    read_file(book_list, file_name)
    n = 3  # number of book objects entered by user
    for i in range(n):
        title = input("Please enter the book title: ")
        author = input("Please enter book author: ")
        while True:
            try:
                year = int(input("Please enter publication year: "))
                if year > 0:
                    break
                else:
                    print("Year must be greater than zero.")
            except ValueError:
                print("Please enter an integer greater than zero for year.")
        book_list.append(Book(title, author, year))
    write_file(book_list, file_name1)
except FileNotFoundError as e:
    print(e)
```

**Explanation**:
In the main section of the script:
1. It defines file names and an empty list to hold book objects.
2. It reads existing book data from "books.txt" and adds it to the list.
3. It prompts the user to enter details for three new books, ensuring the publication year is a positive integer.
4. It writes the updated list of books to "books1.txt".

---