class A:
    def __init__(self,name,age):
        self.age = age
        self.name = name
    def display(self):
        print("Name is",self.name,"and age is",self.age)
    def hello(self):
        print("Base class")
class B(A):
    def hello(self):
        super().hello()
        print("Derived class")

b = B("Hero",19)
b.display()
b.hello()