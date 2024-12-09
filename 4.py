class Vehicle:
    def __init__(self,brand):
        self.brand = brand
    def start_engine(self):
        return "Starting the engine."
class Car(Vehicle):
    def start_engine(self):
        return "Starting the car engine."
    
obj = Car("Toyota")
print(f"{obj.brand}: {obj.start_engine()}")