"""
A group of statisticians at a local college has asked you to create a set of functions
that compute the median and mode of a set of numbers, as defined in Section
5.4. Define these functions in a module named stats.py. Also include a function
named mean, which computes the average of a set of numbers. Each function
should expect a list of numbers as an argument and return a single number. Each
function should return 0 if the list is empty. Include a main function that tests the
three statistical functions with a given list.
"""
import statistics

number_set = []


def main():

    textfile1 = input("Please enter the first text file: ")
    number_set = open(textfile1, "r")
    print(f'the median of the list of numbers is : {median(number_set)}')
    print(f'the mode of the list of numbers is : {mode(number_set)}')
    print(f'the mean of the list of numbers is : {mean(number_set)}')

def median(number_set):

    median_number = statistics.median(number_set)

    return median_number

def mode(number_set):

    mode_number = statistics.mode(number_set)

    return mode_number

def mean(number_set):

    mean_number = statistics.mean(number_set)

    return mean_number

main()