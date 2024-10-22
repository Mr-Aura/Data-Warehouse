from abc import ABC, abstractmethod
class Abstract(ABC):#interface.
    @abstractmethod
    def demo(self):
        pass
class Normal(Abstract):
    def demo(self):
        print("Abstract method")
# ab  = Abstract() will give error.
nn = Normal()
nn.demo()
'''
Key Features of Interfaces
1.Only contain abstract methods: Interfaces generally do not contain any concrete methods; 
they only define method signatures.
2.Cannot be instantiated: Just like abstract classes, you cannot create an 
instance of an interface.
3.Defines a contract: Interfaces are used to define a set of methods that a class 
must implement.
'''