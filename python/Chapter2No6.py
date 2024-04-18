import math
"""
The kinetic energy of a moving object is given by the formula KE = (1/ 2)mv2
where m is the object’s mass and v is its velocity. Modify the program you created
in Project 5 so that it prints the object’s kinetic energy as well as its momentum.
"""
mass = float(input("Enter the mass of the object in kilograms: "))
velocity = float(input("Enter the velocity of the object in meters per second: "))
KE =(1/2)*((mass * velocity)**2)
print("The kinetic energy of the moving object is: ", KE)