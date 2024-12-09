class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def get_details(self):
        return f"Name : {self.name} , Age: {self.age}"

class Student(Person):
    def __init__(self,name,age,ID):
        super().__init__(name,age)
        self.ID = ID
    def get_details(self):
        return f"Name : {self.name}, Age : {self.age}, Student ID : {self.ID}"
    
obj = Student("Alice",20,"S12345")
print(obj.get_details())