#Static methods are used when we have to ship the method with a class.
#Which means that the function can be called using the class name as well as with object.
#We dont pass self as first argument in static methods unlike other normal methods in class.
class alpha:
    def __init__(self,name,occupation):
        self.name = name
        self.occupation = occupation
    def details(self):
        print("Name is",self.name)
        print("Occupation is",self.occupation)
    @staticmethod
    def add(a,b):
        print(a+b)
aa = alpha("Harry","Footballer")
aa.details()
alpha.add(10,20)
aa.add(90,10)