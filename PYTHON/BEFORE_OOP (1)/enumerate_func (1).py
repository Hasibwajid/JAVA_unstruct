# l1=["first","second","third","fourth"]
# for index,item in enumerate(l1):
#     #index start from 0 and item is start from 1 item in list l1 (first)
#     if index%2==0:
#         print(item)


#python
# Python program to illustrate
# enumerate function
l1 = ["eat","sleep","repeat"]
s1 = "geek"

# creating enumerate objects
obj1 = enumerate(l1)
obj2 = enumerate(s1)

print ("Return type:",type(obj1))
print (list(enumerate(l1)))

# changing start index to 2 from 0
print (list(enumerate(s1,2)))



# Syntax:
# enumerate(iterable, start)
# Parameter Values
# Parameter	Description
# iterable	An iterable object
# start	A Number. Defining the start number of the enumerate object. Default 0


# EXPLAINATION
# Often, when dealing with iterators, we also get a need to keep a count of iterations. Python eases the programmers’ task by providing a built-in function enumerate() for this task.
# Enumerate() method adds a counter to an iterable and returns it in a form of enumerating object. This enumerated object can then be used directly for loops or converted into a list of tuples using the list() method.