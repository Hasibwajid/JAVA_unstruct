f=open("1.txt")
print("position of pointer is: ",f.tell())
print(f.readline())
print(f.readline())
# print(f.tell())
# print(f.readline())
# print(f.tell())
# print(f.readline())
print("seek pointer again at position 0 :",f.seek(0))
print(f.readline())

print("seek pointer again at position 6 :",f.seek(6))
print(f.readline())

f.close()