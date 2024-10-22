class Employee:
    NumberOfEmployees = 0 #class variable
    CompanyName = "OnePlus" #class variable
    def __init__(self,name,salary,age):
        self.name = name #instance variable
        self.salary = salary #instance variable
        self.age = age #instance variable
        Employee.NumberOfEmployees+=1 #class variable getting incremented
    def details(self):
        print("\nCompany name is",self.CompanyName,"\nEmployee Name is",self.name,"\nSalary is",self.salary,"\nAge is",self.age,"\nTotal employees are",self.NumberOfEmployees)
e1 = Employee("Harry",90000,25)
e1.details()
e2 = Employee("Kevin",100000,33)
e2.details()
    