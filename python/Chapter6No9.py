"""
Write a program that computes and prints the average of the numbers in a text
file. You should make use of two higher-order functions to simplify the design.
"""
def main():
    text = input("Enter a text file: ")


def average(text):
    with open(text, 'r') as reader:
        for line in reader:
            fields = line.strip().split()
            my_average = sum(fields) / len(fields)
            print(my_average)


if __name__ == '__main__':
    main()