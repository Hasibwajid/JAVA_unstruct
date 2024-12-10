import numpy as np
from sklearn.linear_model import LogisticRegression
from sklearn import datasets
import matplotlib.pyplot as plt

iris = datasets.load_iris()

'''Model to predict wheather the flower is virginica iris or not '''
# print(iris['data'])
# print(iris['DESCR'])


x = iris['data'][:,3:]#only third index column  (at index 3 -pattel width (feature is) we are dealing with only one feature)

y = (iris['target'] ==2 ).astype(int)


classifier = LogisticRegression()

classifier.fit(x,y)

print(classifier.predict([[1.0]]))#if result will 1 then flower will be virginica



'''
USING MATPLOTLIB FOR VISUALIZIING
'''

# x_new = np.linspace(0,3,1000).reshape(-1,1)
# y_prob = classifier.predict_proba(x_new)
# plt.plot(x_new,y_prob[:,1],"g-")
# plt.show()
