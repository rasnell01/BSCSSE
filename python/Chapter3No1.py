import math

"""
Write a program that accepts the lengths of three sides of a triangle as inputs.
The program output should indicate whether or not the triangle is an equilateral
triangle.
"""

triangle_base = int(input("Enter the base of the triangle: "))
triangle_height = int(input("Enter a side of the triangle: "))

def is_equilateral(triangle_base, triangle_height):
    if triangle_base == triangle_height:
        return True
    else:
        return False

print('The triangle being equilateral is:', is_equilateral(triangle_base,
                                                           triangle_height))