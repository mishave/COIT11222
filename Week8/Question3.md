### **Question Three:**
In Week 6, you worked on a tutorial question where you developed an application involving the creation of five instances of the `Book` class. This application was structured into two distinct modules:
- `main.py`
- `book.py`

Retrieve these modules from Moodle or your local storage. They encompass the source code you've previously crafted. Furthermore, there's a file titled `"books.txt"` that holds information about the books. The sample format of this file is shown below:

Each line in this file represents data for a `Book` object in the following format:

```
Title|Author|Year
```

### **Explanation of Each Component:**
- **Title**: Represents the value of the `title` attribute of the `Book` object.
- **Author**: Represents the value of the `author` attribute of the `Book` object.
- **Year**: Represents the value of the `publication_year` attribute of the `Book` object.

### **Task Breakdown:**
To complete this task, you will:
1. **Read the contents of the `"books.txt"` file** and import the book data into a `books` list.
2. **Add five additional `Book` objects** to the `books` list:
   - `book6 = Book("Brave New World", "Aldous Huxley", 1932)`
   - `book7 = Book("The Lord of the Rings", "J.R.R. Tolkien", 1954)`
   - `book8 = Book("The Alchemist", "Paulo Coelho", 1988)`
   - `book9 = Book("The Chronicles of Narnia", "C.S. Lewis", 1950)`
   - `book10 = Book("Crime and Punishment", "Fyodor Dostoevsky", 1866)`
3. **Write the information for the ten `Book` objects** to a new file named `"books1.txt"`.
   
The resulting `"books1.txt"` file should appear as follows:

```
Brave New World|Aldous Huxley|1932
The Lord of the Rings|J.R.R. Tolkien|1954
The Alchemist|Paulo Coelho|1988
The Chronicles of Narnia|C.S. Lewis|1950
Crime and Punishment|Fyodor Dostoevsky|1866
... (plus the contents from the original "books.txt")
```

### **Steps to Implement the Task:**

#### **Step 1: Read Data from "books.txt"**

1. **Open and read the file** `"books.txt"`.
2. **Parse each line** to extract the title, author, and year, and create a `Book` object for each line.
3. **Append each `Book` object** to a list called `books`.

**Example Code:**

```python
def read_file(lst, file_name):
    with open(file_name, "r") as file:
        for line in file:
            title, author, year = line.strip().split("|")  # Split the line by '|'
            book = Book(title, author, int(year))  # Create a Book object
            lst.append(book)  # Add the Book object to the list

books = []
read_file(books, "books.txt")
```

#### **Step 2: Add Five Additional Book Objects**

1. **Manually create five new `Book` objects** with the specified titles, authors, and publication years.
2. **Append these new `Book` objects** to the `books` list.

**Example Code:**

```python
# Creating additional Book objects
book6 = Book("Brave New World", "Aldous Huxley", 1932)
book7 = Book("The Lord of the Rings", "J.R.R. Tolkien", 1954)
book8 = Book("The Alchemist", "Paulo Coelho", 1988)
book9 = Book("The Chronicles of Narnia", "C.S. Lewis", 1950)
book10 = Book("Crime and Punishment", "Fyodor Dostoevsky", 1866)

# Adding the new books to the list
books.extend([book6, book7, book8, book9, book10])
```

#### **Step 3: Write Data to "books1.txt"**

1. **Open or create the file** `"books1.txt"` in write mode.
2. **Write each book’s data** from the `books` list to the file in the format `Title|Author|Year`.

**Example Code:**

```python
def write_file(lst, file_name):
    with open(file_name, "w") as file:
        for book in lst:
            file.write(f"{book.title}|{book.author}|{book.publication_year}\n")

write_file(books, "books1.txt")
```

### **Final Steps:**

1. **Test your code** to ensure that it reads and writes the book data correctly.
2. **Submit a zip file** containing:
   - `main.py`
   - `book.py`
   - `books.txt`
   - `books1.txt`

Make sure your program correctly handles file reading and writing and that the data is formatted properly in the output file.

### **Important Note:**
- **Why use `extend` instead of `append`?**
  - The `extend` method is used because it adds each `Book` object individually to the `books` list. If you used `append`, the entire list of new `Book` objects would be added as a single element, creating a nested list. By using `extend`, the `books` list remains flat, with each `Book` object as a separate entry.
  
  - **Example:**
    - Using `append` with a list of books:
      ```python
      books.append([book6, book7, book8, book9, book10])
      # books would become: [..., [book6, book7, book8, book9, book10]]
      ```
      Instead, we would have to call append for each item individually or
    - Using `extend` with a list of books:
      ```python
      books.extend([book6, book7, book8, book9, book10])
      # books would become: [..., book6, book7, book8, book9, book10]
      ```

### **Full Code Snippet for Reference:**

Below is the full code snippet for your reference that integrates reading from a file, adding new books, and writing to a new file:

```python
from book import Book

def find_copies(lst, this_book):
    count = 0
    for book in lst:
        if book == this_book:
            count = count + 1
    return count

# Function to read book data from a file
def read_file(lst, file_name):
    with open(file_name, "r") as file:
        for line in file:
            title, author, year = line.strip().split("|")  # Split the line by '|'
            book = Book(title, author, int(year))  # Create a Book object
            lst.append(book)  # Add the Book object to the list

# List to hold Book objects
books = []

# Read existing books from "books.txt"
read_file(books, "books.txt")

# Add five additional Book objects
book6 = Book("Brave New World", "Aldous Huxley", 1932)
book7 = Book("The Lord of the Rings", "J.R.R. Tolkien", 1954)
book8 = Book("The Alchemist", "Paulo Coelho", 1988)
book9 = Book("The Chronicles of Narnia", "C.S. Lewis", 1950)
book10 = Book("Crime and Punishment", "Fyodor Dostoevsky", 1866)

# Use extend to add all new books at once
books.extend([book6, book7, book8, book9, book10])

# Alternative: Use append to add each book individually (commented out)
# books.append(book6)
# books.append(book7)
# books.append(book8)
# books.append(book9)
# books.append(book10)

# Function to write book data to a file
def write_file(lst, file_name):
    with open(file_name, "w") as file:
        for book in lst:
            file.write(f"{book.title}|{book.author}|{book.publication_year}\n")

# Write all books to "books1.txt"
write_file(books, "books1.txt")

# Example usage for finding copies of a specific book
book_list = []
book1 = Book("The Catcher in the Rye", "J.D. Salinger", 1951)
book2 = Book("To Kill a Mockingbird", "Harper Lee", 1960)
book3 = Book("1984", "George Orwell", 1949)
book4 = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
book5 = Book("The Catcher in the Rye", "J.D. Salinger", 1951)

book_list.append(book1)
book_list.append(book2)
book_list.append(book3)
book_list.append(book4)
book_list.append(book5)

# Print all the books in the book_list
for book in book_list:
    print(book)

# Find number of copies of the book "The Catcher in the Rye"
print("Title: {}, Copies: {}".format(book1.title, find_copies(book_list, book1)))

# Find number of copies of the book "To Kill a Mockingbird"
print("Title: {}, Copies: {}".format(book2.title, find_copies(book_list, book2)))
```

```python
class Book:
    def __init__(self, title, author, publication_year):
        # Instance variables for each book instance
        self.title = title
        self.author = author
        self.publication_year = publication_year

    def __str__(self):
        # Instance method to return book information as a string
        return "{} by {}, published in {}".format(self.title, self.author, self.publication_year)

    def __eq__(self, other):
        # Instance method to compare two Book instances based on their attributes
        if isinstance(other, Book):
            return (self.title == other.title and self.author == other.author 
                    and self.publication_year == other.publication_year)
        return False

```
