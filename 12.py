class Car:
    def __init__(self,make,model,year):
        self.make = make
        self.model = model 
        self.__year = year
    def get_year(self):
        return self.__year
    def set_year(self,year):
        if year>0:
            self.__year = year
        else:
            print("Invalid year")
    def display(self):
        print(f"The make of the car is {self.make} and Year is {self.__year}")

obj = Car("Toyota","Camry",2022)
obj.display()
obj.set_year(2023)
obj.display()
obj.set_year(-1)
obj.display()
