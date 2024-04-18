import sys


def length(a_list):
    if len(a_list) == 0:
        return 0
    else:
        return 1 + (length(a_list[1:]))


def member_of(a_list, num):
    if len(a_list) == 0:
        return False
    elif a_list[0] == num:
        return True
    else:
        #stored in a function stack worked top to bottom
        return member_of(a_list[1:], num)



print(member_of([1, 2, 3, 4, 5], 7))
