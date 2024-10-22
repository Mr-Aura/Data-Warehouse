class A:
    def __init__(self,value):
        self.value = value
    def details(self):
        print("Value of Class A variable is",self.value)
class B:
    def set_instance(self,class_a_instance):#passing member using function.
        self.class_a_instance = class_a_instance
    def display(self):
        self.class_a_instance.details()
aa = A(10)
bb = B()
bb.set_instance(aa)
bb.display()