class A:
    def __init__(self,value):
        self.value = value
    def details(self):
        print("Value of Class A variable is",self.value)
class B:
    def __init__(self,class_a_instance):#using constructor to pass member.
        self.class_a_instance = class_a_instance
    def display(self):
        self.class_a_instance.details()
aa = A(10)
bb = B(aa)
bb.display()