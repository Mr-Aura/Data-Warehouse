a = int(input("Enter the 1st number:"))
b = int(input("Enter the 2nd number:"))
c = int(input("Enter the 3rd number:"))
if a>b and b>a:
    print(a,"is greatest.")
elif b>a and b>c:
    print(b,"is greatest.")
else:
    print(c,"is greatest.")