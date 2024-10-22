arm = 0
n = int(input("Enter the number:"))
temp = n
while n>0:
    r = n % 10
    arm = (r*r*r)+arm
    n = n // 10
if temp == arm:
 print(temp,"is Armstrong.")
else:
   print(temp,"is not Armstrong.")