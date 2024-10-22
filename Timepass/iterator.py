# an iterator is an object that allows you to traverse through a sequence of elements 
# in a date type such as list,string,tuple etc.
# Provides a way to access these elements without knowing the underlying structure.
a = [1,2,3]

iteration = iter(a)

print(next(iteration))
print(next(iteration))
print(next(iteration))
# So using next() we are going through the list and once we reach the end and we try 
# to use it again.
#It will throw StopIteration exception
# because list does not have any more elements
# print(next(iteration))
# Even our for loop uses iterators in backend.