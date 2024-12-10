import random
from PyDictionary import PyDictionary
import platform
import  numpy as ap
import pandas as pd


# RANDOM
# random_no=random.randint(2,9)#random btw 2 to 9
# print(random_no)

# rand=random.random()#random btw 0 to 1
# print(rand)

# rand=random.random()*100#random btw 0 to 100
# print(rand)

# l1=["haseeb","muneeb","ehsan","usman","hassan","hamza","ali"]
# choose=random.choice(l1)
# print(choose)


# a = random.randrange(10, 15)
# b = random.randbytes(5)
#
# print(a)
# print(b)



# PYDICTIONARY

# dictionary=PyDictionary()
# x=input("Enter word to check its meaning: ")
# print(dictionary.meaning(x))
# y=input("Enter word to check its antonym: ")
# print(dictionary.antonym(y))
# z=input("Enter word to check its synonym: ")
# print(dictionary.synonym(z))
# print(dictionary.translate("respect",'ur'))#translate to urdu



# PLATFORM MODULE AND ITS FUNCTIONS
#
# print("processor is :", platform.processor())
# print("architecture  is :", platform.architecture())
# print("system is :", platform.system())
# print("compiler is :", platform.python_compiler())
# print("python branch:", platform.python_branch())
# print("python version:", platform.python_version())


# a1=ap.arange(1,10)
# print(a1)


# n1=pd.Series({'KARAN':42,'PRITESH':44,'JATIN':45,'ROSHAN':46})
# print(n1)



# a=[87,90,43,21]
# print(pd.Series(a))




# How to delete a File
# import os
# isExist=os.path.exists("ffff.txt")
#
# if isExist:
#     print("Yes file with this name exist\n"
#           "Do You want to delete the file\n"
#           "1.yes\n"
#           "2.No")
#     choose=int(input())
#     if choose==1:
#         os.remove("ffff.txt")
#         print("Deleted")
#     else:
#         print("Okays!")
# else:
#     print("No file exist with this name")





# A RegEx, or Regular Expression, is a sequence of characters that forms a search pattern.
# import re
# txt = "Everything is Possible"
# x = re.search("^Everything.*Possible$", txt)
#
# if (x):
#   print("YES! We have a match!")
# else:
#   print("No match")
#
#
# str = "Everything is Possible"
# x = re.findall("i", str)
# print(x)



# import platform
#
# x = platform.system()
# print(x)
#
#
# x = dir(platform)
# print(x)



# import datetime
# time = datetime.datetime.now()
# print(time)



# import builtins
# print(builtins.bool(1))
# print(builtins.pow(2,9))
#
# import math
# print("sqrt of 64 is:",math.sqrt(64))
# print("value of sin 45:",math.sin(math.radians(45)))
# print("value of sin 45:",math.sin(45))




# import calendar
# print("which year calender you need")
# year = int(input("enter year \n"))
# cldr = calendar.calendar(year)
# print(cldr)


# import statistics
# list1=[1,2,3,4,5]
# stats=statistics.mean(list1)
# print(stats)
#
# stats1=statistics.mode(list1)
# print(stats1)
