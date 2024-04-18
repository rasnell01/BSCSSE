import math
"""
An object’s momentum is its mass multiplied by its velocity. Write a program
that accepts an object’s mass (in kilograms) and velocity (in meters per second) as
inputs and then outputs its momentum.
"""
mass = float(input("Enter the mass of the object in kilograms: "))
velocity = float(input("Enter the velocity of the object in meters per second: "))
momentum = mass * velocity
print("The momentum is", momentum)