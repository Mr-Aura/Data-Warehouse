def hello(*a):
#If we do not know the number of arguments that will be passed in function then 
# we can use '*' before parameter name.
#This way the function will receive a tuple of arguments and can access items accordingly.
    print(a[0],a[1],a[2])
hello(10,20,30)