#bubble sort algorithm
li=[2,3,7,4,6,5,0,1]
# li.sort();
print(li)
n=len(li)
count=0
for i in range(0,n):
    for j in range (0,n-1):
        if (li[j+1] < li[j]):
            temp=li[j+1]
            li[j+1]=li[j]
            li[j]=temp
        count+=1
# print("Sortted list is: ",li)
print("The num of iteration to sort are:",count)
