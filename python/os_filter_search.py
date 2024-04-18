import os
import re

currentDirectoryPath = os.getcwd()
listOfFileNames = os.listdir(currentDirectoryPath)
for name in listOfFileNames:
    if '.py' in name:
        if re.match(r'[A-Za-z_]+\.py', name):
            print(name)
            with open('listOfFiles.txt', 'a') as writer:
                writer.write(name + '\n')

