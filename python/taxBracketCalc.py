import math

TAX_10_PERCENT = 1000
TAX_15_PERCENT = 1500 + TAX_10_PERCENT
TAX_20_PERCENT = 4000 + TAX_15_PERCENT
income = 0
taxes = 0
try:
    def main():
        print("Tax bracket calculator")
        user_input(income)
        print(f'Your taxes are: ${"%.2f" % calc(income,taxes)}')
    def user_input(income):

        income = float(input("Enter your income in number only format: ".strip()))

        return income
    def calc(income, taxes):
        if income < 10000:
            taxes = 0
        elif income > 10000 and income < 20000:
            taxes = ((income-10,000) * 0.10)
        elif income > 20000 and income < 30000:
            taxes = ((income-20000) * 0.15) + TAX_10_PERCENT
        elif income > 30000 and income < 50000:
            taxes = ((income-30000) * 0.20) + TAX_15_PERCENT
        elif income > 50000:
            taxes = ((income-50000) * 0.30) + TAX_20_PERCENT
        else:
            print("Incorrect input")
        return taxes

    main()
except ValueError:
    print("Please enter a valid number")
    try:
        main()
    except ValueError:
        print("You failed to comply with the input request")