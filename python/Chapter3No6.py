import math

"""
The German mathematician Gottfried Leibniz developed the following method
to approximate the value of Pi:
Pi/4 =  1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/17 + 1/19 - 1/21 . . .
Write a program that allows the user to specify the number of iterations used in
this approximation and that displays the resulting value.
"""


iterations = int(input("Enter number of iterations: "))
array = []
def calcPi(array):

        pi_over_4 = 1

        for n in range( iterations ):

                pi_over_4 += (-1)**n/(2*n +1)
                array.append(pi_over_4)
        return pi_over_4*4

calcPi(array)
print(array)


"""
array = []

for i in range(3, iterations*2, 2):
        array.append(i)

print(array)

counter = 0
while counter < len(array):
        for i in array:
                if counter == 0:
                        print(f'{leibniz} = 1')
                        print(f'- 1/{array[i]}')
                        counter += 1
                elif (counter % 2) == 0:
                        print(f'- 1/{array[i]}')
                        counter += 1
                elif (counter % 2) != 0:
                        print(f'+ 1/{array[i]}')
                        counter += 1
                else:
                        print("invalid input value")
"""
