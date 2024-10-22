class Employee:
    def __init__(self,ID,name,sal,dept):
        self.ID = ID
        self.name = name
        self.sal = sal
        self.dept = dept
    def print_emp_details(self):
        print("ID is",self.ID)
        print("Name is",self.name)
        print("Salary is",self.sal)
        print("Department is",self.dept)
    def assign_dept(self,updated_dept):
        self.dept = updated_dept
    def calculate_emp_sal(self,sal,hours_worked):
        overtime = 0
        if hours_worked > 50:
            overtime = hours_worked - 50
        self.sal = sal+(overtime*sal//50)
#Creating Object
e1 = Employee("E7876","ADAMS",50000,"ACCOUNTING")
e2 = Employee("E7499","JONES",45000,"RESEARCH")
e3 = Employee("E7900","MARTIN",50000,"SALES")
e4 = Employee("E7698","SMITH",55000,"OPERATIONS")
#Printing Original Details
print("\nOriginal Employee details:")
e1.print_emp_details()
e2.print_emp_details()
e3.print_emp_details()
e4.print_emp_details()
#Updating department
e1.assign_dept("OPERATIONS")
e4.assign_dept("SALES")
#Calculating Overtime Salary
e2.calculate_emp_sal(45000,52)
e4.calculate_emp_sal(55000,60)
#Printing Updated details
print("\n\nUpdated details:")
e1.print_emp_details()
e2.print_emp_details()
e3.print_emp_details()
e4.print_emp_details()