import array
arr = array.array('i',[1,2,3,4,5])
#indexing here starts from 0 till 4. Backward indexing also supported.  
print(arr[1]) # arr[1]=2, Forward indexing
print(arr[-1]) # arr[-1]=5, Backward indexing
#array slicing:
print(arr[1:3]) 
print(arr[1:-1])