#len function
str = "John"
print(len(str)) #used to print the length of the string.

#printing using for loop
for i in range(0,len(str)):
    print(str[i],end="")

#capitalize function.
st = "abc"
print("\n",st.capitalize()) #capitalizes the 1st alphabet

#find function :
a = "Football is life"
b = "is"
print(a.find(b,0,len(a)-1)) #prints 9 as 'is' is found in 9th index.

#isalnum function : isalphanumeric -> full form.
c="hello123"
print(c.isalnum()) #returns True if there are alphabets or numbers.
d=""
print(d.isalnum()) # returns False if the string is blank and has no alphabets or numbers.

#isdigit function : checks if the string only has digit, if yes then true otherwise false.
e = "123"
f = "hello12"
print(e.isdigit()) # returns true as there are only numbers.
print(f.isdigit()) # returns false as there are ALPHABETS with numbers.

