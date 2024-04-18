import random
import statistics


"""
myList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(myList)
myList.sort(reverse=True,)
print(myList)
"""
def main():

    print(f'Median: {calc_median()}')
    print(f'Mean: {calc_mean()}')
    print(f'Mode: {calc_mode()}')
    print(f'Variance: {calc_variance()}')
    print(f'Standard Deviation: {calc_standard_deviation()}')


myList2 = []
for i in range(16):
    num = random.randint(1, 100)
    myList2.append(num)

print(myList2)

def calc_median():
    return statistics.median(myList2)

def calc_mean():
    return statistics.mean(myList2)

def calc_mode():
    return statistics.mode(myList2)

def calc_variance():
    return statistics.variance(myList2)

def calc_standard_deviation():
    return statistics.stdev(myList2)

if __name__ == '__main__':
    main()

"""
user_brackets = input("Enter a string: ")


def main():

    stringBracketChecker(user_brackets)

def stringBracketChecker(user_brackets):
    brackets = []
    for bracket in user_brackets:
        if bracket == '{':
            brackets.append(bracket)
        else:
            if len(brackets) == 0:
                print("Invalid bracket")
                return
            else:
                brackets.pop()

    if len(brackets) == 0:
        print("valid")
    else:
        print("invalid")

if __name__ == "__main__":
    main()
"""