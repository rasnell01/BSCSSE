def main():
    user_input = input("Enter a simple equation: ")
    operand1, sign, operand2 = user_input.strip().split(" ")

    print(operand1)
    print(f'{sign}{operand2}')
    print("_____")

    if sign == "+":
        print(add(operand1, operand2))
    elif sign == "-":
        print(sub(operand1, operand2))
    elif sign == "*":
        print(mul(operand1, operand2))
    elif sign == "/":
        print(div(operand1, operand2))
    elif sign == "%":
        print(mod(operand1, operand2))
    elif sign == "**":
        print(pow(operand1, operand2))
    else:
        print("Invalid input")

def add(operand1,operand2):
    return int(operand1) + int(operand2)

def sub(operand1,operand2):
    return int(operand1) - int(operand2)

def mul(operand1,operand2):
    return int(operand1) * int(operand2)

def div(operand1,operand2):
    return int(operand1) // int(operand2)

def mod(operand1,operand2):
    return int(operand1) % int(operand2)

def pow(operand1,operand2):
    return int(operand1) ** int(operand2)

main()