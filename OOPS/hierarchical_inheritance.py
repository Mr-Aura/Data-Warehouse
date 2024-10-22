class A:
    a = 10
    b = 20
class B(A):
    def add(self):
        print("The addition of 2 numbers =",(self.a+self.b))
class C(A):
    def multiply(self):
        print("The multiplication of 2 numbers =",(self.a*self.b))
bb = B()
cc = C()
bb.add()
cc.multiply()