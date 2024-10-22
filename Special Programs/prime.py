n = int(input("Enter number to check if prime or not:"))
count=0
for i in range(2,n+1):
    if n%i==0:
        count = count+1
if(count==1):
    print("Prime number")
else:
    print("Not prime number")