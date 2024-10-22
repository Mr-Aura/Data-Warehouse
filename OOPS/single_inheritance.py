class Alpha:
    name = "Harry Kane"
    sal = 900000
class Beta(Alpha): # here we pass the class we are inheriting as argument.
    occ = "Footballer"
    def info(self):
        print(self.name,"is",self.occ)
a = Beta()
a.info()