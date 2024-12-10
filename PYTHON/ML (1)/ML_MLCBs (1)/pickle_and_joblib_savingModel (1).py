from sklearn import linear_model
import pandas as pd

import pickle


df = pd.read_excel("df.xlsx")

model = linear_model.LinearRegression()

model.fit(df[['area']] , df.price)

'''
with open('model_pickle','wb') as file:
    pickle.dump(model , file)


with open('model_pickle' , 'rb') as f:
    myFetched = pickle.load(f)

print(myFetched.predict([[2000]]))
print(myFetched.coef_, myFetched.intercept_)
'''


# USING JOBLIB

import joblib

joblib.dump(model, 'model_joblib')

fetched = joblib.load('model_joblib')
print(fetched.coef_)