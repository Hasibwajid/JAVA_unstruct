import random

pc_points=0
user_points=0
i=0
while i<10:
    print("Turn no: {}".format(i+1))
    Pc = random.randint(1, 3)
    u=int(input("Choose one:\n"
                "1.snack\n"
                "2.water\n"
                "3.gun\n"))
    if u==1 and Pc==2 or u==2 and Pc==3 or u==3 and Pc==1:
        user_points=user_points+1
        print("Your Point Added")
    else:
        pc_points=pc_points+1
        print("Pc's point added")
    i=i+1

if user_points>pc_points:
    print("CONGRATS! YOU WON WITH {}".format(user_points)," points")
elif user_points==pc_points:
    print("MATCH DRAW BOTH HAVE SAME POINTS")
else:
    print("OOH YOU LOSE THE GAME!")

print("RESULT:\n"
      "YOUR POINTS: ",user_points,"\n"
    "PC'S POINTS    : ",pc_points)