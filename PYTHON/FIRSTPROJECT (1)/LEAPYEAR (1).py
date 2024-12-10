year=int(input("ENTER THE YEAR TO CHECK IF THE YEAR IS LEAP OR NOT : "))
# if(year%400==0):
#     print(year," is a leap year")
# elif(year%100==0):
#     print(year," is not leap year")
# elif(year%4==0):
#     print(year," is leap year")
# else:
#     print(year, "is not leap year")

 #OR by nested loop

if year%4==0:
     if year%100==0:
         if year%400==0:
             print(year," is a leap year")
         else:
             print(year,"is not a leap year")
     else:
         print(year, "is  a leap year")
else:
    print(year, " is not a leap year")


