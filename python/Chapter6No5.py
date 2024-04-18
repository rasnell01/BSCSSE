"""
A list is sorted in ascending order if it is empty or each item except the last one is
less than or equal to its successor. Define a predicate isSorted that expects a list
as an argument and returns True if the list is sorted, or returns False otherwise.
(Hint: For a list of length 2 or greater, loop through the list and compare pairs of
items, from left to right, and return False if the first item in a pair is greater.)
"""
import random

def main():
    myList = []
    for i in range(16):
        num = random.randint(1, 100)
        myList.append(num)
    print(myList)
    print(isSorted(myList))


def isSorted(myList):
    for i in range(len(myList)):
        if myList[i] > myList[i+1]:
            return False



if __name__ == "__main__":
    main()