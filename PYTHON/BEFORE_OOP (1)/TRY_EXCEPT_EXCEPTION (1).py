num1=int(input("ENTER NUM 1: "))
num2=int(input("ENTER NUM 2: "))

try:
    ans=num1/num2
except Exception as e:
    print(e)

print("HELLO WORLD AFTER EXCEPTION HANDLING IS PRINTING IN FRONT OF YOU")