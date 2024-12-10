# f=open("1.txt")
# print(f.readlines())
# f.readline()
# f.close()


# if we open with (with block) then no need to close file
with open("1.txt") as f:
    print(f.readline())

