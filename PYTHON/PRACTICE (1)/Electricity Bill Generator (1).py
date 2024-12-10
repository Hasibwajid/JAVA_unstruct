'''
unit = int(input("Units consumes: "))
amt = 0
if unit > 1 and unit <= 50:
    amt = 0.5*unit
elif unit>50 and unit <= 150:
    amt=((unit-50)*0.75)+(50*0.5)
elif unit>150 and unit <= 250:
    amt = ((unit-150)*1.20)+(50*0.5)+(100*0.75)
if unit>250:
    amt = ((unit-250)*1.50)+(50*0.5)+(100*0.75)+(100*1.20)

finalAmout = amt+(amt*0.2)
print("No of Units consumed by user: ",unit,"\n"
      "Bill: ",amt,"\n"
       "Final Amount(After adding additional tax): ",finalAmout)
'''