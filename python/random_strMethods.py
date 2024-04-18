"""
converting decimal numbers into binary, hexadecimal and octal numbers
"""
integer = int(input("Enter an integer: ").strip())
binary = format(integer, 'b')
print(binary)
hexadecimal = format(integer, 'x')
print(hexadecimal)
octet = format(integer, 'o')
print(octet)
print(bin(integer))
print(hex(integer))
print(oct(integer))
"""
converting back into decimal numbers from binary, hexadecimal and octal numbers
"""
binary2 = input("Enter a binary number: ").strip()
decimal = int(binary2, 2)
print(decimal)
hexadecimal2 = input("Enter a hexadecimal number: ").strip()
decimal2 = int(hexadecimal2, 16)
print(decimal2)
octal2 = input("Enter a octal number: ").strip()
decimal3 = int(octal2, 8)
print(decimal3)