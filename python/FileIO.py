import csv
import sys

file_name = input("Enter file name: ")
new_file = input("Enter new file name: ")


with open(file_name, 'r') as reader, open(new_file, 'a') as writer:
    for line in reader:
        fields = line.strip().split()
        writer.write(": ".join(fields)+"\n")

# read csv files
csv_file = input("Enter a CSV file name: ")
with open(csv_file, 'r') as reader:
    csv_reader = csv.reader(reader)
    for row in csv_reader:
        print(row)

with open(csv_file, 'a') as writer:
    csv_writer = csv.writer(writer)
    for row in writer:
        csv_writer.writerow(row)
