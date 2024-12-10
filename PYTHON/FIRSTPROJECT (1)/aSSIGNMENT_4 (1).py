
# ch=input("Enter a char: ")
# if(ch.isalpha()):
#     if(len(ch)>1):
#          print("Error! \n Enter only one char ")
#     elif(ch=='a' or ch=='A' or ch=='e' or ch == 'E' or ch == 'i'
#       or ch=='I' or ch=='o' or ch=='O' or ch=='u' or ch=='U'):
#        print(ch," is a vowel")
#     else:
#      print(ch ,"is a consonant")
# else:
#     print("Error! \n please enter an alphabet b/s A to Z or a to z")



#Qno:2
# def count(str):
#     uppercase, lowercase, numbercase, specialcase = 0, 0, 0, 0
#     for i in range(len(str)):
#         if (str[i] >= 'A' and str[i] <= 'Z'):
#             uppercase += 1
#         elif (str[i] >= 'a' and str[i] <= 'z'):
#             lowercase += 1
#         elif (str[i] >= '0' and str[i] <= '9'):
#             numbercase += 1
#         else:
#             specialcase += 1
#     return uppercase, lowercase, numbercase, specialcase
# str=input("Enter a string")
# print("Original strings:", str)
# upper, lower, number, special = count(str)
# print('\nUpper case characters: ', upper)
# print('Lower case characters: ', lower)
# print('Number case: ', number)
# print('Special case characters: ', special)


#no3


# Total=int(input("Number of classes held   : " ))
# att=int(input("Number of classes attended :"))
# persantage=(att/Total)*100
# print("Your Attendence is ",persantage,"%")
# if persantage>75:
#     print("You're Eligible To Attend The Exams")
# else:
#     print("You're not Eligible To Attend the Exams")



# from math import sqrt
#
# def roots():
#     if r > 0:
#         num_roots = 2
#         x1 = (((-b) + sqrt(r)) / (2 * a))
#         x2 = (((-b) - sqrt(r)) / (2 * a))
#         print("There are 2 roots: %f and %f" % (x1, x2))
#     elif r == 0:
#         num_roots = 1
#         x = (-b) / 2 * a
#         print("There is one root: ", x)
#     else:
#         num_roots = 0
#         print("No roots, discriminant < 0.")
#
#
#
# print("Quadratic function : (a * x^2) + b*x + c")
# a = float(input("enter value of a: "))
# b = float(input("enter value of b: "))
# c = float(input("enter value of c: "))
# roots(a,b,c)
# r = b**2 - 4*a*c



import cmath
def quadric_equ():
    a = float(input('Enter a: '))
    b = float(input('Enter b: '))
    c = float(input('Enter c: '))

# calculate the discriminant
    d = (b**2) - (4*a*c)

# find two solutions
    sol1 = (-b-cmath.sqrt(d))/(2*a)
    sol2 = (-b+cmath.sqrt(d))/(2*a)

    print('The solution are {0} and {1}'.format(sol1,sol2))
quadric_equ()