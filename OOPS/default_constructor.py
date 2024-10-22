class Employee:
    name = "Harry Kane"
    occ = "Developer"
    def __init__(self): # default constructor
        print(self.name,"is a",self.occ)
a = Employee()
#default constructor is a constructor which doesn't accept any argument from object and 
# has only one argument , self in constructor.