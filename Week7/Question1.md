`def generate_sentence(lst):
    return ' '.join(lst)

words_list = []
while True:
    user_input = input("Please enter a word (or 'n' to stop): ")
    if user_input.lower() == 'n':
        break
    else:
        words_list.append(user_input)

sentence = generate_sentence(words_list)
print("Generated sentence:", sentence)`


Explanation:
Defining the Function

def generate_sentence(lst):
We define a function called generate_sentence that takes a list (lst) as its parameter.
return ' '.join(lst)
Inside the function, we use the join method to combine all the words in the list (lst) into a single string, separated by spaces, and return it.
Creating an Empty List

words_list = []
Before entering the loop, we create an empty list called words_list to store the words that the user will enter.
The Loop to Get User Input

while True:
We create an infinite loop that will run until it encounters a break statement.
user_input = input("Please enter a word (or 'n' to stop): ")
We use the input function to get a word from the user.
if user_input.lower() == 'n':
We check if the user has entered 'n' (allowing for both uppercase and lowercase 'n'). If so, we break the loop.
else:
If the user hasn't entered 'n', we enter the else block.
words_list.append(user_input)
Inside the else block, we add the word entered by the user to the words_list.
Generating and Printing the Sentence

sentence = generate_sentence(words_list)
After exiting the loop, we call the generate_sentence function with the words_list as the parameter to create the sentence.
print("Generated sentence:", sentence)
We then print the generated sentence to the console.
