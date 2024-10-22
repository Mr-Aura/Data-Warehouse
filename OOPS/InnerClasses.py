class OuterClass:
    def __init__(self,OuterValue):
        self.OuterValue = OuterValue
    class InnerClass:
        def __init__(self,InnerValue):
            self.InnerValue = InnerValue
        def displayInner(self):
            print("Inner Class value is",self.InnerValue)
    def displayOuter(self):
            print("Outer Class value is",self.OuterValue)
OuterObj = OuterClass(10)
# print(OuterObj.OuterValue) Can also write like this instead of calling function
OuterObj.displayOuter()
InnerObj = OuterObj.InnerClass(20)
# print(InnerObj.InnerValue) Can also write like this instead of calling function
InnerObj.displayInner()