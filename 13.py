class Base:
    def __init__(self):
        self._a=2
class Derived(Base):
    def __init__(self):
        super().__init__()
        print(f"Calling protected member of base class : {self._a}")
        self._a = 3
        print(f"Calling modified protected member outside class: {self._a}")
        
obj = Derived()
print(f"Accessing protected member of obj : {obj._a}")
obj2 = Base()
print(f"Accessing protected member of obj2 : {obj2._a}")