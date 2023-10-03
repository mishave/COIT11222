### Question 5

```python
class BankAccount:
    def __init__(self, account_number, balance):
        self.account_number = account_number
        self.balance = balance
        
    def deposit(self, amount):
        self.balance = self.balance + amount
        
    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance = self.balance - amount
        else:
            print(f"Insufficient funds in account {self.account_number}.")

    def __eq__(self, other):
        return self.account_number == other.account_number and self.balance == other.balance
    
    def __str__(self):
        return f"Account Number: {self.account_number}, Balance: ${self.balance:.2f}"


# Create two instances of the BankAccount class
account1 = BankAccount("1005895", 35000)
account2 = BankAccount("1007777", 55000)

# Withdraw $5000 from the first account and deposit $500 in the second account
account1.withdraw(5000)
account2.deposit(500)

# Display the balance of both accounts using the __str__ method
print(account1)
print(account2)
```

When you run this code, you'll get:

```
Account Number: 1005895, Balance: $30000.00
Account Number: 1007777, Balance: $55500.00
```

This code defines the `BankAccount` class with special methods and then performs the requested operations on two instances of the class. The `__str__` method provides a string representation of the account, and the `__eq__` method checks if two accounts are the same based on their account number and balance.