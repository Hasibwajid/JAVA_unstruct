##1
# Write a Python program to get the Python version you are using.
# import sys
# print("Version: ",sys.version)
# print("Version_info: ",sys.version_info)


##2
# Write a Python program to display the current date and time.
# from _datetime import datetime
# print("data and time: ",datetime.now().strftime("%Y-%m-%d %H:%M:%S"))


##3
# Write a Python program which accepts the radius of a circle from the user and compute the area
# r=float(input("Enter radius of circle: "))
# print(3.14*(r)*(r))


##4
# Write a Python program which accepts the user's first and last name and print them in reverse order with a space between them.
# f=(input("Enter Fname: "))
# l=(input("Enter Lname: "))
# print(l[::-1],f[::-1])


##5
# s=input("Enter some nums : " )
# print("LIST :",list(s))
# tuple=tuple(s)
# print("TUPLE :",tuple)


##6
# input a file name and print the extension of that file?
# fName = input("ENter file name with extension: ")
# if fName.__contains__("."):
#     f_extns=fName.split(".")
#     print(repr(f_extns[-1]))
# else:
#     print("FIle has no extension")


##7
# write a program to display the first and last element of  the followind list
# list=["balck","brown","red","yellow"]
# print(list[0])
# print(list[len(list)-1])
# # or
# print(list[-1])


##8
# FORMAT
# d=(15,33,3333)
# print(type(d))
# print("The exam'll be start from: %i/%i/%i"%d)


##9
#:::: THIS PROGRAM WILL DISPLAY YOUR DATE OF BIRTH :::::
# print("\t\t\t\t\t\t:::: THIS PROGRAM WILL DISPLAY YOUR DATE OF BIRTH :::::")
# d=int(input("Enter Birth Date: "))
# m=int(input("Enter Birth Month: "))
# y=int(input("Enter Birth Year: "))
# s=d,m,y
# print("Your Date Of Birth Is: %i/%i/%i"%s)


##10
# input==>> 5  THEN  Output==>> 5+55+555 = 615
# n = int(input("Enter num: "))
# n1 = int(n)
# n2 = str(n)+str(n)
# n3 = str(n)+str(n)+str(n)
# print(n1+int(n2)+int(n3))

# OR

# n = int(input("Enter num: "))
# n1 = int( "%s" % n)
# n2 = int( "%s%s" % (n,n))
# n3 = int( "%s%s%s" % (n,n,n))
# print(n1+n2+n3)


##11
# print the document of python  built in functions
# print("SELECT ONE TO CHECK ITS WORKING: \n"
#       "1.abs()\n"
#       "2.enumerate()\n"
#       "3.print()\n")
# Option = int(input())
# if Option == 1:
#     print("\t\t\t\t\t\t\t\t:::ABS FUCTION WORKING::::\n\n", abs.__doc__)
# elif Option == 2:
#     print("\t\t\t\t\t\t\t\t:::ENUMERATE FUCTION WORKING::::\n\n", enumerate.__doc__)
# elif Option == 3:
#     print("\t\t\t\t\t\t\t\t:::PRINT FUCTION WORKING::::\n\n", print.__doc__)

'''
# PYTHON PROGRAM TO REVERSE A STRING
def reverse_str(str):
    return str[::-1]
str = input('Enter a string: ')
print(f'Reversed od {str} is :', reverse_str(str))
'''

'''
# Program to check if the word/string is palindrome
def isPalindrome(str):
    return str == str[::-1]
word = input('Enter a string: ')
print(f'the word {word.upper()} is palindrome ?. ', isPalindrome(word))
# a palindrome is a word or a phrase that’s the same whether it’s forward or backward.
'''