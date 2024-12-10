# l=[1,2,3,4,5]
# result=list(map(lambda a:a*a,l))
# print(result)


# multiply two functions using map
# l=[1,2,3,4,5]
# l2=[5,4,3,2,1]
# result=list(map(lambda a,b:a*b,l,l2))
# print(result)

# make list of word using map
# words=["HASEEB","WAJID"]
# re=map(list,words)
# print(list(re))



###################################### FILTER ############################################

# GET VOWEL LETTERS USING FILTER WITHOUT AND WITH LAMDA FUNCTION
# def vowel(letter):
#     vowels=["a","e","i","o","u"]
    # if letter in vowels:
    #     return True
    # else:
    #     return False


# with lamda func
# vowels=["a","e","i","o","u"]
# sequence=["a","b","c","d","e","f","g","h","i"]
# res=filter(lambda letter:letter in vowels,sequence)
# print("VOWELS IN SEQUENCE ARE:",list(res))




# # a list contains both even and odd numbers.
# seq = [0, 1, 2, 3, 5, 8, 13]
#
# # result contains odd numbers of the list
# result = filter(lambda x: x % 2 != 0, seq)
# print(list(result))
#
# # result contains even numbers of the list
# result = filter(lambda x: x % 2 == 0, seq)
# print(list(result))



###################################### REDUCE ############################################
# At first step, first two elements of sequence are picked and the result is obtained.
# Next step is to apply the same function to the previously attained result and the number just succeeding the second element and the result is again stored.
# This process continues till no more elements are left in the container.
# The final returned result is returned and printed on console.

# import functools


# # CHECK GRETER NUM USING REDUCE
# l=[1,2,4,5,6,7]
# result2=functools.reduce(lambda a,b:a if a>b else b,l)
# print("GREATER NUM IN LIST IS=",result2)


# reduce() can also be combined with operator functions to achieve the similar functionality as with lambda functions and makes the code more readable.

import operator

# l3=[1,32,4,5,77,4]
# ress=functools.reduce(operator.add,l3)
# print("Sum of nums in list is: ",ress)


# ress=functools.reduce(operator.mul,l3)
# print("Product of nums in list is: ",ress)


# names=["HASEEB","WAJID"]
# print("NAME AFTER CONCATINATE ARE:",functools.reduce(operator.add,names))