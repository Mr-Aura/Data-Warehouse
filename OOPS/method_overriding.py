class Alpha:
    name = "Harry Kane"
    sal = 900000
    def info(self):
        print(self.name,"salary is",self.sal)
class Beta(Alpha):
    def info(self):
        print("Hello")
b = Beta()
b.info()