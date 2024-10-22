#Decorator is a function which that takes another function as input, extends its behavior
#and returns a new function without modifying the og function's source code.
#Decorators are used to add functionality to existing functions without changing their
# structure. This provides reusability.
def decorator_greet(func):
    def wrapper():
        print("Hello")
        func()
        print("Bye")
    return wrapper

@decorator_greet
def greet():
    print("Greetings.")
greet()    

