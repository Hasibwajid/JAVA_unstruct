"""
TO READ DOCS HERE
help()
"""


# h="haseeb"
# print(h.capitalize())#capitalize first letter
#
# print(type(h))#check type of var


"""
#LIST
items=[1,2,3,"haseeb"]
print(items)
print(type(items))

items[0]="value at index 0 replace with this"
print(items)
"""


'''
#TOUPLE
tup=(1,2,4,"G")
print(tup)
print(type(tup))
#touple are immutable
'''




# #DICTIONARY
# dic1= {'haseeb':19,'muneeb':17 }
# print(dic1.keys())
# print(dic1.values())
# print(dic1.items())
#
# print(dic1["haseeb"])
# print(dic1["muneeb"])
#
# dic1.update({"muneeb": 18})
# print("Updated value of muneeb is: ",dic1["muneeb"])
#
# dic1.popitem()#it'll romove last item in dic1
# print("After popitem (remove last item)",dic1)
#
# dic1.pop("haseeb",19)
# print("After pop (remove specific item)",dic1)





# #FILE_HANDLING
# # write into file
# f=open("1.txt","w")
# f.write("haseeb")
# f.close()
#
# # read from file
# f=open("1.txt","r")
# content=f.read()
# f.close()
# print("\nData geting from 1.txt file is: ",content)





# #LOOPS
#
# # for
# a=1
# for a in range (10):
#     print("\n",a)
#     # OR
# for b in range (10,15):
#     print("\n",b)
#
# # while
# a=2
# while(a<100):
#     print(a)
#     a=a+2



# # SETS:
# not repeat same elements. <<SYNTAX-->>set_name={element,element,......}
#
# s=set()
# s.add(1)
# s.add(2)
# s.add(1)
#
# s1=s.union({1,2,3}) #union func creates another set
# s2=s.intersection({1,2,3,4})#print same element in both
# s3={1,2,3,4}
#
# print("set =",s,"\nset1 ka union with set =",s1,"\nset2 ka intersection with set =",s2,"\nLength of set =",len(s),"\nMax in set is= ",max(s),"\nMin in set is= ",min(s),"\nset isdisjoint with s3= ",s.isdisjoint(s3))

# # ISDISJOINT METH
# -->> Two sets are said to be disjoint if they do not have any common elements. For example Set {1, 2, 3} and Set {4, 5, 6} are disjoint sets because they do not have any common elements.
