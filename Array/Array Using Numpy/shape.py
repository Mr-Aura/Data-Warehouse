import numpy as np
a = np.array([[1,2,3],[4,5,6]])
print(a.shape) 
#output: (2,3)
# the shape of an array is the number of elements in a dimension.
# if one dimension has 4 elements and other dimension has 3 elements
# then using shape will give error. For example:
# a = np.array([[1,2,3,4],[5,6,7]])
# here one dimension has 4 elements whereas the other has 3 so error.