class Animal:
    def speak(self):
        pass
    
class Dog(Animal):
    def speak(self):
        return "Woof!"
    
class Cat(Animal):
    def speak(self):
        return "Meow!"

my_list = [Dog(),Cat()]

for animal in my_list:
    print(animal.speak())