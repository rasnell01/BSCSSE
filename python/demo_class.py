try:
    response = str(input("Do you want to get going? "))

    if response == 'yes' or response == 'maybe' or response == 'no':
        print("Thanks for the response.")
    elif response == 'kill':
        print("Blood makes the grass grow!")
    else:
        print("Yes, no, maybe... Some shit like that?!?")
except TypeError:
    print("You did not follow the instructions fucker!")