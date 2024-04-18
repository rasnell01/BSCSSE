import math

"""
Teachers in most school districts are paid on a schedule that provides a salary
based on their number of years of teaching experience. For example, a beginning
teacher in the Lexington School District might be paid $30,000 the first year. For
each year of experience after this first year, up to 10 years, the teacher receives a
2% increase over the preceding value. Write a program that displays a salary schedule,
in tabular format, for teachers in a school district. The inputs are the starting
salary, the percentage increase, and the number of years in the schedule. Each row
in the schedule should contain the year number and the salary for that year.
"""

def main():
    calculate_salary(starting_salary, years)

starting_salary = float(input("Enter starting salary: "))
years = int(input("Enter number of years: "))

def calculate_salary(starting_salary, years):
    percent = .02 * years
    salary = starting_salary
    if years <= 10:
        salary = (salary * percent) + salary
        print(f"Salary for {years} is ${salary:.2f}")
    elif years > 10:
        percent = ((years - 10) / 100) + (.02 * years)
        salary = (salary * percent) + salary
        print(f"Salary for {years} years is {salary:.2f}")
    else:
        print("Invalid input")

    return salary

main()