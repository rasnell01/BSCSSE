"""
Write a script that inputs a line of encrypted text and a distance value and outputs
plaintext using a Caesar cipher. The script should work for any printable characters.
"""

cyphertext = input("Enter a plaintext: ")
distance = int(input("Enter a distance value: "))

def incrypt_caesar_cipher(cyphertext, distance, decrypt=True):
   result = ""
   for character in cyphertext:
       if character.isalpha():
           shift = distance if not decrypt else -distance
           if character.islower():
               result += chr(((ord(character) - ord('a') + shift) % 26) + ord('a'))
           else:
               result += chr(((ord(character) - ord('A') + shift) % 26) + ord('A'))
       else:
           result += character
   return result

print(incrypt_caesar_cipher(cyphertext, distance, decrypt=True))