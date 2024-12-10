class Train():

    def __init__(self, id, name, engineNo, no_compartment,capacity):
        self.id=id
        self.name=name
        self.engineNo=engineNo
        self.compartment=no_compartment
        self.capacity=capacity


    def printDetail(self):
        return f"Name: {self.name} \nEngine No: {self.engineNo} \nCompartment:" \
               f"{self.compartment} \nCapacity: {self.capacity}"


    # # CLASS METHOD
    # @classmethod
    # def from_dash(cls,string):
    #     # param=string.split("-")
    #     # return cls(param[0],param[1],param[2],param[3],param[4])
    #     # OR
    #     return cls(*string.split("-")) #(*) will pass as an arguments after spliting the string


    #STATIC METHOD IS (INSTANCE OF CLASS) NO NEED TO CALL WITH VARIABLE IT CAN BE ACALLED USING DIRECT CLASS
    @staticmethod
    def goodPrint(string):
        print(f"HE IS A GOOD BOY AND HIS NAME IS --> {string} ")





if __name__ == '__main__':
    T1=Train(1,"Badar",2.2,50,500)
    # print(T1.printDetail())

    #CODE FOR CLASS METHOD
    # t2=Train.from_dash("1-BAdar-33-334-1000")
    # print("capacity is: ",t2.capacity)

    # CODE FOR STATIC METHOD
    print(T1.goodPrint("OKAY"))