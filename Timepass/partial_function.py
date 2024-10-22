'''
A partial function in Python is a way to fix a certain number of arguments of a function 
and generate a new function with fewer arguments. 
This is useful when you want to create a simpler version of a function by 
"freezing" some of its arguments.

You can use the functools.partial function to create partial functions in Python.

Partial functions are particularly handy when you have a function with many arguments, 
and you want to create simpler versions of it for 
specific use cases by fixing some arguments to constant values.
'''
from functools import partial

def power(base,exponent):
    return base ** exponent

square = partial(power,exponent=2)
print(square(5))
print(square(3))