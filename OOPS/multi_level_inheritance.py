class A:
    def first(self):
        print("Class A")
class B(A):
    def second(self):
        print("Class B")
class C(B):
    def third(self):
        print("Class C")
cc = C()
cc.first()
cc.second()
cc.third()