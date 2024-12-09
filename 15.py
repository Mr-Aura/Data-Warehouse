try:
    num1 = int(input("Enter the first number:"))
    num2 = int(input("Enter the second number:"))
    result = num1 / num2
except ZeroDivisionError:
    print("Error! Divide by zero not allowed.")
except ValueError:
    print("Invalid input. Please enter a numeric value.")
else:
    print(f"{num1} / {num2} = {result}")
finally:
    print("Execution completed.")
    