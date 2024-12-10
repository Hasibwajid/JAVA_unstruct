l1=["haseeb",1,3,4,"Muneeb",233,33,63,8,"ali"]

#print only numeric values which are greater than 6

for i in l1:
    if str(i).isnumeric() and i>6:
        print(i)