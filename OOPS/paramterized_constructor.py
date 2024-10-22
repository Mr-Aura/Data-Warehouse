class Employee:
    def __init__(self,name,occ): # parameterized constructor.
        self.name = name
        self.occ = occ
    def info(self):
        print(self.name,"is a",self.occ)
a = Employee("KDB","Footballer")        
a.info()
#When a constructor accepts argument along with self it is known as 
# parameterized constructor.