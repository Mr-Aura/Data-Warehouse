import numpy as np
arr = np.array([1,2,3,2,2,5,2])
x = np.where(arr==2)
print(x)
# to search an element from the array, we use the where function.
# in output we get the index number of where the element exists.