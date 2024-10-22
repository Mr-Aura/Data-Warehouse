rev = 0
n = int(input("Enter number:"))
temp = n
while n>0:
    r = n % 10
    rev = (rev*10)+r
    n = n // 10
print("The reverse of",temp,"is",rev)