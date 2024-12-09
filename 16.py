from abc import ABC,abstractmethod

class Car(ABC):
    def __init__(self,brand,model,year):
        self.brand = brand
        self.model = model
        self.year = year
    @abstractmethod
    def printDetails(self):
        pass
    def accelerate(self):
        print("Speed up...")
    def break_applied(self):
        print("Car stopped...")

class Hatchback(Car):
    def printDetails(self):
        print(f"Brand : {self.brand}")
        print(f"Model : {self.model}")
        print(f"Year : {self.year}")
    def sunroof(self):
        print("Not having this feature...")

obj = Hatchback("Toyota","Camry",2022)
obj.printDetails()
obj.accelerate()
obj.sunroof()    