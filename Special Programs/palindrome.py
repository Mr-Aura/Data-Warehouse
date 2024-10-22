palindrome = 0
n = int(input("Enter the number:"))
temp = n
while n>0:
    r = n % 10
    palindrome = (palindrome*10)+r
    n = n // 10 # single / returns float value and loop never terminates so we use // 
if temp == palindrome:
    print(temp,"is palindrome.")
else:
    print(temp,"is not palindrome.")