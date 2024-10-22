class Employee:
    @classmethod
    def Company(cls,companyName):
        cls.companyName = companyName
    def __init__(self,age,name,ID):
        self.age = age
        self.name = name
        self.ID = ID
    def details(self):
        print("Age is",self.age)
        print("Name is",self.name)
        print("ID is",self.ID)
        print("Company Name is",self.companyName)
e1 = Employee(19,"Kane","RA9")
Employee.Company("MNK")
e1.details()