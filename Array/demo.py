import array
arr = array.array('i',[1,2,3,4,5])
for i in range(len(arr)):
    print(arr[i])
# print("1D array:",list(arr)) can also print by converting array into list.
print(type(arr)) # used to check class name