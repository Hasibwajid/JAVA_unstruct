# iterate over list and print the type of each item in list
# l1=[11,11.2,(2,3),[1,"haseeb"],{"he":"boy","she":"girl"},'hello']
# for x in l1:
#     print("type of ",x ,' is : ',type(x))


# #iterate each item in list
# l2=[1,2,3,4,5,6,7,8,9,10]
# for i in l2:
#     print('l2 is :',i ,end='  ')



# iterate each member in set
# s=set([('a','b','c'),1,2,3,4,"haseeb"])
# print(type(set))
# for i in s:
#     print(i,"\n")
#
#
# # Iterating over dictionary
# d={"haseeb":"boy","he":"boy","she":"boy"}
# for key in d:
#     print(key)
# # for iterate its value
# for value in d.values():
#     print("\n",value)
#
# s=set()
# s.add(0)
# s.add(4)
# s2=set([1,2])
# print(s.isdisjoint(s2))
# a=[1,2,3]
# for i in a:
#     print(i)
#     if i>2:
#       print(i)
#       break
# else:
#     print("ffds")
# list=["haseeb", "usman", "hassan", "hamza","shahbaz"]
# name=input("Enter name to search : ")
# if name in list:
#     print(name)
# else:
#     print("Search not found")
# def Sum(a, b):
#     c = a + b
#
#     # Returning the value
#     return c
#
#
# # Function call
# d = Sum(3, 4)
# print(d)


list=[88, 54, 55, 77,66]
l = []
for i in list:
    if i>70:
        l.append(i)
print("new list containing marks grater then 70 is : ", l)