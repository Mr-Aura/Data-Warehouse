import math

class Circle:
    def __init__(self,radius):
        self.radius = radius
    def calculate_area(self):
        return math.pi * self.radius**2
    def calculate_perimeter(self):
        return 2 * math.pi * self.radius
    def show(self):
        print(f"The radius of the circle is {self.radius}")
        print(f"The area of the circle is {self.calculate_area()}")
        print(f"The perimeter of the circle is {self.calculate_perimeter()}")

obj = Circle(5)
obj.show()