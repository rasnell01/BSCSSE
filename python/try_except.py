def main():
    enter_age(age)

age = 0
def enter_age(age):
    try:
        age = int(input('Enter your age: '))
        if age <= 17:
            print('You are too young')
        elif age >= 18 and age < 150:
            print('You are old enough')
        elif age >= 150:
            print('What are you a damn vampire??')

    except ValueError:
        print('Please enter an integer')
    else:
        print(f'You entered {age} years old')
    return age

main()