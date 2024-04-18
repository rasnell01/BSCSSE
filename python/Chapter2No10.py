import math
"""
An employee’s total weekly pay equals the hourly wage multiplied by the total
number of regular hours plus any overtime pay. Overtime pay equals the total
overtime hours multiplied by 1.5 times the hourly wage. Write a program that
takes as inputs the hourly wage, total regular hours, and total overtime hours and
displays an employee’s total weekly pay.
"""
hourly_wage = int(input("Hourly wage: "))
total_regular_hours = int(input("Total regular hours: "))
total_overtime_hours = int(input("Total overtime hours: "))
total_weekly_wage = (hourly_wage * total_regular_hours) + (total_overtime_hours * (total_regular_hours*1.5))
print("The total weekly wage is", total_weekly_wage)
