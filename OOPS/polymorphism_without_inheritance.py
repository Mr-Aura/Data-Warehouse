class first:
    def __init__(self,a,b):
        self.a = a
        self.b = b
    def calculate(self):
        print("The addition of 2 numbers =",(self.a+self.b))
class second:
    def __init__(self,a,b):
        self.a = a
        self.b = b
    def calculate(self):
        print("The subtraction of 2 numbers =",(self.a-self.b))
class third:
    def __init__(self,a,b):
        self.a = a
        self.b = b
    def calculate(self):
        print("The multiplication of 2 numbers =",(self.a*self.b))
        
a = first(10,20)
b = second(10,20)
c = third(10,20)
for i in [a,b,c]:
    i.calculate()