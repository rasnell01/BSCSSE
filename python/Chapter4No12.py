"""
The Payroll Department keeps a list of employee information for each pay period
in a text file. The format of each line of the file is the following:
<last name> <hourly wage> <hours worked>
Write a program that inputs a filename from the user and prints to the terminal a
report of the wages paid to the employees for the given period. The report should
be in tabular format with the appropriate header. Each line should contain an
employee’s name, the hours worked, and the wages paid for that period.
"""

input_filename = input("Enter file name: ")
input_file = open(input_filename, "r")
print("\t name\twage\thoursworked")
print(input_file.read())