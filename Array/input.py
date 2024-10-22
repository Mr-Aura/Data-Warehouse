import array
a=int(input("Enter the 1st element: "))
b=int(input("Enter the 2nd element: "))
c=int(input("Enter the 3rd element: "))
d=int(input("Enter the 4th element: "))
e=int(input("Enter the 5th element: "))
arr = array.array('i',[a,b,c,d,e])
print("Array elements:")
for i in range(len(arr)):
    print(arr[i],end=" ");
