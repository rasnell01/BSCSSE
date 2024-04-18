"""
Define and test a function myRange. This function should behave like Python’s
standard range function, with the required and optional arguments, but it should
return a list. Do not use the range function in your implementation! (Hints:
Study Python’s help on range to determine the names, positions, and what to do
with your function’s parameters. Use a default value of None for the two optional
parameters. If these parameters both equal None, then the function has been
called with just the stop value. If just the third parameter equals None, then the
function has been called with a start value as well. Thus, the first part of the function’s
code establishes what the values of the parameters are or should be. The
rest of the code uses those values to build a list by counting up or down.)
"""
import os


def main():
    start = int(input("Enter start value:"))
    stop = int(input("Enter stop value:"))
    myArray = []
    myRange(start, stop, myArray)
    print(myArray)


def myRange(start, stop, myArray):
    for i in range(start, stop+1):
        myArray.append(start + randunder(stop - start +1))
    return myArray

def randunder(num):
    if num <= 0:
        raise ValueError("n must be greater than or equal to zero")
    kilo = num.bit_length()
    numbytes = (kilo + 7)//8
    while True:
        ran = int.from_bytes(random_bytes(numbytes), 'big')
        ran >>= numbytes * 8 - kilo
        if ran < num:
            return ran


def random_bytes(n):
    with open('/dev/urandom', 'rb') as file:
        return file.read(n)


if __name__ == "__main__":
    main()