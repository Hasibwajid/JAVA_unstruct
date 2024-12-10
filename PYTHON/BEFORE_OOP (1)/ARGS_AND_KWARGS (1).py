# name of parameter can be any
def me(*args,**kwargs):
    for i in args:
        print(i)
    for i,j in kwargs.items():
        print(f"keys is {i} and value is {j}")

l=["haseeb","muneeb","hassan","abdullah","usman"]

d={"haseeb":"2nd","muneeb":"1st","hassan":"1st","abdullah":"3rd","usman":"1st"}
me(*l,**d)
