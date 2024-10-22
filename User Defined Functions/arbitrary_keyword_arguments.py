# If we do not know the number of keyword arguments that will be passed in function then
# we add '**' before parameter name. This way the function will receive a dictionary of
# arguments and can access items accordingly. 
def hello(**a):
    print(a["y"])
hello(x=10,y=20)