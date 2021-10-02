import random
import os
import re

cpoint = 0
upoint = 0
os.system('cls')
for i in range(0,3):
    print('\n')
    print("Rock, Paper, Scissors!!!")
    uss = input("Choose for Rock-R, Paper-P, Scissors-S: ")
    if not re.match("[SsRrPp]", uss):
        print("Please Select Correct Letters!!")
        print("Rock-R, Paper-P, Scissors-S")
        continue
    choices = ['R','P','S']
    opp = random.choice(choices)
    print("I chose: "+ opp)
    if opp==str.upper(uss):
        print("Draw!!")

    elif opp==str('P') and str.upper(uss) == ('R'):
        print("Computer +1")
        cpoint = cpoint + 1

    elif opp==str('S') and str.upper(uss) == ('P'):
        print("Computer +1")
        cpoint = cpoint + 1

    elif opp==str('R') and str.upper(uss) == ('S'):
        print("Computer +1")
        cpoint = cpoint + 1

    elif opp==str('R') and str.upper(uss) == ('P'):
        print("Player +1")
        upoint = upoint + 1

    elif opp==str('P') and str.upper(uss) == ('S'):
        print("Player +1")
        upoint = upoint + 1

    elif opp==str('S') and str.upper(uss) == ('R'):
        print("Player +1")
        upoint = upoint + 1

    else:
        break
print('\n')
print("Results: ")
if(upoint>cpoint):
        print("Player Wins!")
elif(cpoint>upoint):
        print("Computer Wins!")
else:
    print("Its a draw")
