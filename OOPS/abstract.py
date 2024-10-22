from abc import ABC, abstractmethod
class Shape(ABC):#abstract class
    @abstractmethod
    def print_area(self):
        pass
    def show(self):
        print("Abstract class.")
class Rectangle(Shape):
    def __init__(self):
        self.length = 7
        self.breadth = 10
    def print_area(self):
        return self.length * self.breadth
# sh = Shape() Not allowed. Will throw error
rc = Rectangle()
print(rc.print_area())
rc.show()
'''
Key Features of Abstract Classes
1.Cannot be instantiated: You cannot create an instance of an abstract class.
2.Can contain both abstract and concrete methods: Abstract classes can have a mix of 
methods that need to be implemented by subclasses and methods that have a concrete 
implementation.
3.Use the abc module: Abstract classes are created using the abc module in Python.
'''