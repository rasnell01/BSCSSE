myName = "Alan Turing"


print("Hello " + myName)

for letter in myName:
    print(letter)

print("\n")

for letter in myName:
    print(letter.upper())

print("\n")

for (i, letter) in enumerate(myName):
    print(letter)

print("\n")

for letter in myName:
    print(letter.upper())

print("\n")

idx = 0

while idx < len(myName):
    print(myName[idx])
    idx += 1

print("\n")

#recursion it calls itself
def print_letters(myName):
    print(myName[0])
    if len(myName) > 1:
        print_letters(myName[1:])

print_letters(myName)