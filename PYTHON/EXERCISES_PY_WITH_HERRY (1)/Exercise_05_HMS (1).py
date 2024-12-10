def getdate():
    import datetime
    return datetime.datetime.now()


def client_Log(name):
    print("Hello ", name)
    print("Select one:\n"
          "1.Exercise\n"
          "2.Diet")
    ch = int(input())
    if ch == 1:
        if name == "Hammad":
            f = open("hammadEX.txt","a")
            print("HELLO ",name)
            info=input("Enter Excercise you have done: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()

        elif name == "harry":
            f = open("harryEX.txt","a")
            print("HELLO ", name)
            info = input("Enter Excercise you have done: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()


        elif name == "rohan":
            f = open("rohanEX.txt","a")
            print("HELLO ", name)
            info = input("Enter Excercise you have done: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()

    elif ch == 2:
        if name == "Hammad":
            f = open("hammadDiet.txt","a")
            print("HELLO ", name)
            info = input("Enter Diet you have Eaten: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()


        elif name == "harry":
            f = open("harryDiet.txt","a")
            print("HELLO ", name)
            info = input("Enter Diet you have Eaten: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()


        elif name == "rohan":
            f = open("rohanDiet.txt","a")
            print("HELLO ", name)
            info = input("Enter Diet you have Eaten: ")
            f.write(info+"\n")
            print("Successful!")
            f.close()



def clint_Retrive(name):
    print("Hello ",name)
    print("Select one:\n"
          "1.Exercise\n"
          "2.Diet")
    ch = int(input())
    if ch==1:
        if name=="Hammad":
            f=open("hammadEX.txt")
            print(f.read())
            f.close()

        elif name=="harry":
            f = open("harryEX.txt")
            print(f.read())
            f.close()


        elif name=="rohan":
            f = open("rohanEX.txt")
            print(f.read())
            f.close()

    elif ch==2:
        if name == "Hammad":
            f = open("hammadDiet.txt")
            print(f.read())
            f.close()


        elif name == "harry":
            f = open("harryDiet.txt")
            print(f.read())
            f.close()


        elif name == "rohan":
            f = open("rohanDiet.txt")
            print(f.read())
            f.close()



def init():
    print("select one:\n"
          "1.retrive\n"
          "2.log")
    choose=int(input())

    if choose==1:
        print("Select your name:\n"
              "1.Hammad\n"
              "2.harry\n"
              "3.rohan")
        name=int(input())

        if name==1:
            clint_Retrive("Hammad")
        elif name==2:
            clint_Retrive("harry")
        elif name==3:
            clint_Retrive("rohan")

    elif choose == 2:
        print("Select your name:\n"
              "1.Hammad\n"
              "2.harry\n"
              "3.rohan")
        name = int(input())

        if name == 1:
            client_Log("Hammad")
        elif name == 2:
            client_Log("harry")
        elif name == 3:
            client_Log("rohan")

init()
