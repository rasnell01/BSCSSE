"""
Write a program that allows the user to navigate the lines of text in a file. The
program should prompt the user for a filename and input the lines of text into a
list. The program then enters a loop in which it prints the number of lines in the
file and prompts the user for a line number. Actual line numbers range from 1 to
the number of lines in the file. If the input is 0, the program quits. Otherwise, the
program prints the line associated with that number.
"""


textfile1 = input("Please enter the first text file: ")
text_list = open(textfile1, "r")

lines = 0
with open(text_list) as f:
    for line in f:
        lines = lines + 1
    print(f'There are {lines} lines in {textfile1}.')

while True:
    linenum = 0

    line_number = int(input("Please enter a line number or press 0 to quit: "))
    if line_number >=1 and line_number <= linecount:
        file = open(text_list, 'r')
        for lines in file:
            line_num = line_num + 1
            if line_num == line_number:
                print(lines)
    else:
        if line_number == 0:
            print("You have selected 0 and are now quiting the program.")
            break