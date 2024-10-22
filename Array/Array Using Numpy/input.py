import numpy as np
a=[]
n = int(input("Enter the total number of elements:\n"))
for i in range(n):
    val = int(input("Enter the array elements:\n"))
    a.append(val)
arr = np.array(a)
print(arr)