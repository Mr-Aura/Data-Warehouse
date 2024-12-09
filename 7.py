class A:
    def feature1(self):
        print("This is feature 1")
class B(A):
    def feature2(self):
        print("This is feature 2")
class C(A):
    def feature3(self):
        print("This is feature 3")
        
obj1 = B()
obj1.feature1()
obj1.feature2()

obj2 = C()
obj2.feature1()
obj2.feature3()