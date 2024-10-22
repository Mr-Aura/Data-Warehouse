import numpy as np
arr1 = np.array([1,2,3,4,5,6])
arr = np.split(arr1,2)
print(arr)
# splitting is reverse of joining.
# Joining merges multiple arrays into one. Whereas, splitting breaks
# one array into multiple arrays.
# we use split function to split the array.
# we pass the array we want to split and the number of parts it should be 
# split in. Here we have written 2 which means 2 parts.