def hello(): # generator function
    yield 1
    yield 2
    yield 3
x = hello() # calling returns a generator object.
print(next(x)) # every time next is called generator yields next value in sequence
print(next(x))
print(next(x))
#print(next(x))  will give StopIteration exception. 

# Generators are special type of iterator that allows you to iterate over a 
# sequence of values without creating it into the memory at once. Generators are
# defined using functions and yield keyword.