"""
Write a program that inputs a text file. The program should print the unique
words in the file in alphabetical order.
"""

textfile = input("Please enter the first text file: ")
unique_words = open(textfile, "r")
unique_words_list = unique_words.readlines()
unique_words.close()
unique_words_list.sort()

print(unique_words_list)