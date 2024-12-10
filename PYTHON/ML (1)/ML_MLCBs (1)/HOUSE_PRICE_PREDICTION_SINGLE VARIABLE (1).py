from sklearn import linear_model
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("df.csv")

model = linear_model.LinearRegression()

model.fit(df.area , df.price)

pdf = model.predict(3000)

print("the price of house with given area is by model: ",pdf)





'''
                                            :::: NOTES ::::
MATHEMATICALLY PROVE HOW MODEL WORKS
FORMULA:
 ONE_VARIABLE:   y = mx+b
 MULTI_VARIABLE:   y = w1x1 + w2x2b + wo/b

WHAT IS WHAT?
 COEFICIEANT(coef) : SLOPE (M/W)
 feature  : (X)
 intercept  : (B/Wo) 
'''
coef = model.coef_
intercept = model.intercept_

print("By formula: ",coef*3000 + intercept)
