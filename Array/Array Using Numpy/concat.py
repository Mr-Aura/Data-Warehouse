import numpy as np
arr1 = np.array([1,2,3])
arr2 = np.array([4,5,6])
arr = np.concatenate((arr1,arr2))
print(arr)
# We use concatenate function to join two or more arrays, 
# joining means that we are putting the elements of two or more arrays in a
# single array.
# In numpy we join arrays by axes.
# if axis is not passed , it is taken as 0.