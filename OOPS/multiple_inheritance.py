class A:
    def display(self):
        print("Class A")
class B:
    def show(self):
        print("Class B")
class C(A,B):
    def reveal(self):
        print("Class C")
cc = C()
cc.display()
cc.show()
cc.reveal()