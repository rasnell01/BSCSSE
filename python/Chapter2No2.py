import math
"""
You can calculate the surface area of a cube if you know the length of an edge.
Write a program that takes the length of an edge (an integer) as input and prints
the cube’s surface area as output.
"""
edge = int(input("Enter the length of an edge: "))
surface_area = edge * edge * edge
print("The surface area of the cube is", surface_area)