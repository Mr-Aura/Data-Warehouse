'''
MRO Stands for method resolution order. It defines the order in which python searches for
an attribute or method when it is called. It's especially important in cases of multiple
inheritance to determine which class's method is executed first. Follows C3 linearization
algo,which makes sure that child classes are searched first before parent classes.  
'''
class A:
    def display(self):
        print("Class A")
class B:
    def display(self):
        print("Class B")
class C(A,B):#here the order matters if i write A in place of B then output will change.
    def demo(self):
        pass
cc = C()
cc.display()
'''
In this case,First the method is checked in class C. If not found then it will go to 
class A, if again not found then it will check in class B.
'''