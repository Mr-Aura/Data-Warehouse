class School:
    def feature1(self):
        print("This is feature 1")
class Student1(School):
    def feature2(self):
        print("This is feature 2")
class Student2(School):
    def feature3(self):
        print("This is feature 3")
class Student3(Student1,Student2):
    def feature4(self):
        print("This is feature 4")
    
obj = Student3()
obj.feature1()
obj.feature2()