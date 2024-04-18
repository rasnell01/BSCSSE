"""
Write a script named copyfile.py. This script should prompt the user for the
names of two text files. The contents of the first file should be input and written
to the second file.
"""

textfile1 = input("Please enter the first text file: ")
textfile2 = input("Please enter the second text file: ")
with open(textfile1, 'r') as f1:
    with open(textfile2, 'w') as f2:
        for line in f1:
            f2.write(line)
            f2.write('\n')
            f2.flush()
            f2.close()
