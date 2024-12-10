'''LINEAR REGRESSION: IS NOT PERFECT BUT SOMETIMES
BECOME GOOD AND GIVE US A GOOD RESULT.
DRAW A (BEST FIT LINE) TO PREDECT LABLE WHICH DEPENDS ON FEATURES
AND THSESE ARE DEPENDENT ON DATA WE HAVE PROVIDED
DURING TESTING OUR MODEL'''

import numpy as np
from sklearn import datasets,linear_model
from sklearn.metrics import mean_squared_error
import matplotlib as plt


diabetes = datasets.load_diabetes()

diabetes_X = diabetes.data[:,np.newaxis, 2]

# TO PREDICT FOR M Variable/Features
# diabetes_X = diabetes.data

diabetes_X_train = diabetes_X[:-400]#features for train
diabetes_X_test = diabetes_X[-30:]#features to test

diabetes_Y_train = diabetes.target[:-400]#lables to train with these
diabetes_Y_test = diabetes.target[-30:]#lable to test with

model = linear_model.LinearRegression()

model.fit( diabetes_X_train , diabetes_Y_train )

diabetes_Y_predict = model.predict( diabetes_X_test )

#MEAN  SQUARE ERROR (SUM OF ALL ( ACTUAL DATA - PREDICTED DATA))
print("MEAN SQUARE ERROR OF OUR PREDICTION IS: ",mean_squared_error(diabetes_Y_test , diabetes_Y_predict))
print("Weight: ",model.coef_)
print("Intercepts: ",model.intercept_)




