from sklearn import datasets
from sklearn.neighbors import KNeighborsClassifier

iris = datasets.load_iris()

Feature = iris.data #features in data
Lable = iris.target#lables in target

# model using KneighborsClassifier()
model = KNeighborsClassifier()

# training
model.fit(Feature,Lable)#give feature and lable for training

# predicting
print(model.predict([[57,58, 77 ,77]]))

