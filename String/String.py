str = "python"
print(str[-1]) #string also supports backward indexing. So -1 is used to print last character.
print(str[0]) # example of forward indexing.
#strings with operators:
a = "every"+"day" #'+' is concatenation operator.
print(a) #output: everyday
print(4*"hello") # '*' is replication operator. prints hello 4 times.
print("m" in "batman") # membership operator (in,not in) returns true as m is there in the word batman.
print("b" in "superman") # membership operator (in,not in) returns false as b is not there in the word superman.
print("a"=="a") # all relational operators are comparison operators. returns true.
print("A"=="a") # returns false.
print("a"!="A") # returns true.