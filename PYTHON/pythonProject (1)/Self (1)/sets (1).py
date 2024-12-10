# #Different ways to create a sets
# print("\t\t::  DIFFERENT WAYS TO CREATE A SETS  ::")
# n=set()
# print(n)
# print(type(n))
# n=set([1,2,3,4,5,6,7])
# print(n)
# print(type(n))
# n=set({1,2,3,4,5,6,7,8,9,20})
# print(n)
# print(type(n))
#
# #Removing element from set
# print("\n\n\t\t::  REMOVING MEMBER FROM SET  ::")
# num_set=set([1,2,3,4,5,6,7])
# print("Origional set is: ",num_set)
# num_set.pop()
# print("After removing the first element from the said set",num_set)
#
#
# #Write a Python program to add member(s) in a set.
# print("\n\n\t\t::  ADD MEMBER IF TO A SET  ::")
# s_set=set()
# print("Origional set is empty :")
# s_set
# print(s_set)
# print("After add one member : " )
# s_set.add(2)
# print(s_set)
# print("After adding multiple member to set : ")
# s_set.update(["green","yellow",33,44])
# print(s_set)
#
# #Write a Python program to remove an item from a set if it is present in the set.
# print("\n\n::\t\tREMOVING MEMBER IF PRESENT IN SET  ::")
# s=set([8,76,5,4,3,21,1,2,8,9])
# s.discard(8)#it will remove 8 from the set
# print("\nafter remove 8 from the set\n",s)
# s.discard(76)#it will remove 76 from the set
# print("\nafter remove 76 from the set\n",s)
# s.discard(5)#it will remove 5 from the set
# print("\nafter remove 5 from the set\n",s)
#
#
# # Iterate over the set without indexes:
# s1=set([1,3,5,7,9,11,13])
# print("origional ",s1)
# print("iterate members ")
# for i in s1:
#     print(i,end='  ')
#
# #CREATE SET USING STRING:
# char_set=set("muhammad haseeb")
# print("origional ",s1)
# #iterateee using for loop
# print("iterateee using for loop")
# for var in char_set:
#     print(var,end='  ')
#
# #
# s=set([('a','b','c'),1,2,3,4,"haseeb"])
# print('origional set is: ',s)
# s.discard((1))
# print("after removing '1' : ")
# print(s)
# s.discard('haseeb')
# print("after removing 'haseeb' : ")
# print(s)
# s.discard(('a','b','c'))
# print("after removing ('a','b','c') : ")
# print(s)
