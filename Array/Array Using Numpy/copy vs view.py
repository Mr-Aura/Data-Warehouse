import numpy as np
a = np.array([1,2,3,4,5])
x = a.copy()
a[1]=10
print(x) # no changes seen even though changes were made on og array.
y = a.view()
print(y) # changes were seen because in view if og array changes then so does
# the other array.

# Main difference between view and copy is that copy is a new array and 
# view is just a view of og array.