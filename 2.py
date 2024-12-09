class Calculator:
    def addition(self,a,b):
        return a + b
    def subtraction(self,a,b):
        return a - b
    def multiplication(self,a,b):
        return a * b
    def division(self,a,b):
        if b!=0:
            return a/b
        else:
            print("Can't divide by zero.")
obj = Calculator()
num1 = 10
num2 = 20
print(f"{num1} + {num2} = {obj.addition(num1,num2)}")
print(f"{num1} - {num2} = {obj.subtraction(num1,num2)}")
print(f"{num1} * {num2} = {obj.multiplication(num1,num2)}")
print(f"{num1} / {num2} = {obj.division(num1,num2)}")