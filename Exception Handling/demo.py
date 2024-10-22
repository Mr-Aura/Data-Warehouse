try:
    a = int(input("Enter 1st number:"))
    b = int(input("Enter 2nd number:"))
    c = a // b
    print(c)
except:
    print("ZeroDivisionError Caught")
else:
    print("Else is executed when no exception is found in try block.")
finally:
    print("Finally block is always executed.")