import math

"""
Write a program that takes the radius of a sphere (a floating-point number) as
input and then outputs the sphere’s diameter, circumference, surface area, and
volume.
"""
radius = float(input("Enter the radius of the sphere: "))
circumference = radius * math.pi
diameter = radius * math.sin(math.radians(radius))
surface_area = radius * radius * math.pi
volume = diameter * circumference * surface_area
print("The diameter of the sphere is ", diameter)
print("The circumference of the sphere is ", circumference)
print("The surface area of the sphere is ", surface_area)
print("The volume of the sphere is ", volume)