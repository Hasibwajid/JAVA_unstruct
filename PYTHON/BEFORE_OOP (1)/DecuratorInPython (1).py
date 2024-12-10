# Decurator is a function in which you  can set onces which you want to do with many function you can use that func for different funcs


def Dec1(func1):
    def executeNow():
        print("WELCOME IN DECORATOR")
        func1()
        print("GOOD BAY!!")
    return executeNow


# def your_info():
#     print("I AM  M.HASEEB")
#
# # your_info =Dec1(your_info)


@Dec1
def your_info():
    print("I AM  M.HASEEB")

# Calling func (yourInfo)
your_info()
