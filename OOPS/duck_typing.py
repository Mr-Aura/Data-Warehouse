#Duck typing is a concept in python in which the class or type of an object is determined 
#by its behavior(methods and properties) rather than the explicit inheritance and type.
#The name comes from, "if it looks like a duck and quacks like a duck, it's probably a 
# duck."
class Bird:
    def fly(self):
        print("Flying.")
class Airplane:
    def fly(self):
        print("Flying high in the sky.")
def let_it_fly(obj):
     obj.fly()
obj1 = Bird()
obj2 = Airplane()
let_it_fly(obj1)
let_it_fly(obj2)