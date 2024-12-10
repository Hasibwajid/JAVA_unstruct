import numpy as np
import pandas as pd
from sklearn.linear_model import LogisticRegression


'''
This model is sytaxelly correct but data provided to it is not well therefor NOT CORRECT prediction'''
data_set = pd.read_excel("data_set1.xlsx")

x_train = data_set.iloc[:15,[2,3]].values
y_train = data_set.iloc[:15,4].values


x_test = data_set.iloc[14:,[2,3]].values
y_test = data_set.iloc[14:,4].values


classifier = LogisticRegression()

classifier.fit(x_train,y_train)

print(classifier.predict([[47,25000]]))
print(x_test)
print(y_test)

