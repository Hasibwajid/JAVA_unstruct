###### GUESS A NUMBER ######
NUM_OF_GUESS=1
print(":::: ::: :: : YOU HAVE ONLY 10 TRYs : :: ::: ::::\n")
while (NUM_OF_GUESS<=10):
    print(":::: ::: :: : GUESS NO" ,NUM_OF_GUESS," : :: ::: ::::\n")
    n=int(input("GUESS A NUM :\n" ))
    if n==18:
        print(": :: ::: :::: CONGRATULATIONS! :::: ::: :: : \n  \t"
              " >>>YOU WON ON YOU ",NUM_OF_GUESS," GUESS <<<")
        break
    elif n < 18 :
        print("Your num is Lesses.\n")
    elif n > 18:
        print("Your Number is Greater.\n")
        NUM_OF_GUESS+=1

if NUM_OF_GUESS>10:
    print("    :::::: :::::: :::::  YOU LOSE  ::::: :::::: ::::::  ")



# list=[1,'harry',5,'haseeb',3,4,5,6,89,0,34,66,'muneeb',700,'ahmed']
# for item in list:
#     if str(item).isnumeric() and item>6:
#         print(item)



# i=0
# while(True):
#     i+=1
#     print(i)
#     if i==44:
# #         break
#





