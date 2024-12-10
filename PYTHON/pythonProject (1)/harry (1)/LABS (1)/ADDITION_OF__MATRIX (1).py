# for additing two matrix they should have same num of rows and coloumn
nr=int(input('num of rows '))
nc=int(input('num of coloumn'))
li=[]
t=[]
for i in range(0,nr):
    for j in range (0,nc):
        e=int(input('Enter value of matrix 1 '))
        t.append(e)
    print(t)
    li.append(t)
    t=[]

print('List1: ' ,li)

li2=[]

for i in range(0,nr):
    for j in range(0,nc):
        e2=int(input('Enter value for matrix 2'))
        t.append(e2)
    print(t)
    li2.append(t)
    t=[]
print('LIST 2 is ', li2)


li3=[]
for i in range(0,nr):
    for j in range(0,nc):
        e2=li[i][j]+li2[i][j]
        t.append(e2)
    print(t)
    li3.append(t)
    t=[]
print('Sum of list1 and List2 is : ', li3)