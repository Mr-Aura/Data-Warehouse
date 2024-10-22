age = int(input("Enter the age:"))
if age < 0:
    raise Exception("Age cannot be negative.")
elif age>=18:
    print("Eligible to vote.")
else:
    print("Not eligible to vote.")
'''
to print the user defined exception.
try:
 a = int(input("Enter the number less than 100:"))
 if a>100:
    raise Exception("Greater than 100")
except Exception as e:
    print("User defined exception :",e)
'''