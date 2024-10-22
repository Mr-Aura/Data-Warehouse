a = int(input("Enter 1st number: "))
b = int(input("Enter 2nd number: ")) #the reason why we have used int here is because the input
#function takes input in string format so we have to convert it into int format otherwise
#it will only concatenate the 2 numbers for eg: if you enter 2 and 3 it will print 23.
c = a+b 
print("Addition of",a,"+",b,"=",c)