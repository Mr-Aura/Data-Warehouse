import numpy as np
arr = np.array([1,2,3,4])
x = arr[[True,False,False,True]]
print(x)
# Filtering means to remove some elements from an array and create a new one.
# Filtering in numpy is done using boolean list.
# Each element in the boolean list correspond to the array element at that index.
# If 'True' at a particular index then that element will be there in the new array.
# otherwise, if 'False' then that element will be excluded.