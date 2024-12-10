#a)
# With a given tuple (1,2,3,4,5,6,7,8,9,10), write a program to print the first half values in one
# line and the last half values in one line.
# b)
# Write a program to generate and print another tuple whose values are even numbers in the
# given tuple (1,2,3,4,5,6,7,8,9,10).

# t=(0,1,2,3,4,5,6,7,8,9,10)
# t1=()
# for i in t:
#    if i%2:
#         t1 +=(i)
#        #new touple is
# print("Touple of even nos :" ,t1)

# evTuple = (1,2,3,4,5,6,7,8,9,10)
# print("Tuple Items = ", evTuple)
#
# print("\nThe Even Numbers in this evTuple Tuple are:")
# for i in range(len(evTuple)):
#     if(evTuple[i] % 2 == 0):
#         print(evTuple[i], end = "  ")

# a=input("enter a String : \n")
# upperCase=0
# lowerCase=0
# for c in a:
#     if c.isupper():
#         upperCase +=1
#     elif c.islower():
#         lowerCase +=1
# print("Origional String : ",a)
# print ("No. of Upper case characters : ", upperCase)
# print("No. of Upper case characters : ",lowerCase)

# def find_index(elements, value):
#     left, right = 0, len(elements) - 1
#     middle = (left + right) // 2
#
#     if elements[middle] == value:
#         return middle
#
#     if elements[middle] < value:
#         left = middle + 1
#     elif elements[middle] > value:
#         right = middle - 1



# tp=(1,2,3,4,5,6,7,8,9,10)
#
# tp1=tp[:5]
#
# tp2=tp[5:]
#
# print(tp1)
# print(tp2)





# evTuple = (1,2,3,4,5,6,7,8,9,10)
# print("Tuple Items = ", evTuple)
# print("\nThe Even Numbers in this evTuple Tuple are:")
# list=[]
# a=[]
# for i in range(len(evTuple)):
#     if(evTuple[i] % 2 == 0):
#         print(evTuple[i], end = "  ")
#

# balance=1000
# print("wellcome")
# print("""
#  2.withdraw balance
#  3.deposite balance
#   """)

# option=int(input("enter your option:"))
#
# if option==2:
#     withdraw=int(input("how much amount you withdraw"))
#     balance = balance - withdraw
#     print(f"your new balance is {balance}", "\n")
#
# elif option==3:
#     deposite=int(input("how much amount you deposite"))
#     balance = balance+deposite
#     print(f"your new balance is {balance}")

# SUM(C3:C10),=SUM(D3:D10),=SUM(E3:E10)
# b):=AVERAGE(C3:E3)
# c):
# d):=MIN(C3:E3)
# e):=MAX(C3:E3)

tuple_1 = (1,2,3,4,5,6,7,8,9,10)
print("Even Values in tuple")
for i in range(len(tuple_1)):
   if(tuple_1[i] % 2==0):
    print(tuple_1[i])