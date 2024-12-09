class Employee:
    def __init__(self,name,ID):
        self.name = name
        self.ID = ID
    def showDetails(self):
        print(f"The name of employee : {self.ID} is {self.name}")

class Programmer(Employee):
    def showLanguage(self):
        print("The default language is python.")
        
obj = Programmer("Kane",101)
obj.showDetails()
obj.showLanguage()