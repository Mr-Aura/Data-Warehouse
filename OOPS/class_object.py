# Class is blueprint of object.
# Object is an instance of class.
class Employee:
    ID = 1
    name = "Harry Kane"
    salary = 40000

a = Employee()
print(a.name,a.ID,a.salary)

b = Employee()
b.name = input("Enter name: ")
b.ID = int(input("Enter ID: "))
b.salary = int(input("Enter Salary: "))

print(b.name,b.ID,b.salary)