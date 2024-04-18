import math

"""
Write a program that accepts the lengths of three sides of a triangle as inputs.
The program output should indicate whether or not the triangle is a right triangle.
Recall from the Pythagorean theorem that in a right triangle, the square of
one side equals the sum of the squares of the other two sides.
"""
triangle_base = int(input("Enter the base of the triangle: "))
triangle_side_a = int(input("Enter a side of the triangle: "))
triangle_side_b = int(input("Enter the other side of the triangle: "))

def right_angle_triangle(triangle_base, triangle_side_a, triangle_side_b):
    if triangle_base ** 2 == triangle_side_a + triangle_side_b:
        return True
    else:
        return False

print('The triangle being a right angled triangle is: ',
      right_angle_triangle(triangle_base, triangle_side_a, triangle_side_b))