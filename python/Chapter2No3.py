"""
Five Star Retro Video rents VHS tapes and DVDs to the same connoisseurs who
like to buy LP record albums. The store rents new videos for $3.00 a night, and
oldies for $2.00 a night. Write a program that the clerks at Five Star Retro Video
can use to calculate the total charge for a customer’s video rentals. The program
should prompt the user for the number of each type of video and output the total
cost.
"""
NEW_VIDEO = 3.00
OlDES_VIDEO = 2.00
newVideos = int(input("How many new videos? "))
oldVideos = int(input("How many old videos? "))
numberOfNights = int(input("How many nights? "))
totalCost = newVideos * OlDES_VIDEO + oldVideos * NEW_VIDEO * numberOfNights
print("The total cost is", totalCost)