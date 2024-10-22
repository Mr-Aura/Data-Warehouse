class A:
    def first(self):
        print("Class A")
class B:
    def second(self):
        print("Class B")
class C(A,B):
    def third(self):
        print("Class C")
class D(C):
    def fourth(self):
        print("Class D")
        
dd = D()
dd.first()
dd.second()
dd.third()
dd.fourth()        
