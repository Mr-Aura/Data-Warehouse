#Normal way to add elements into the list.
a = []
for i in range(1,51):
    a.append(i)
print(a)
#List comprehension:
#List comprehensions are useful shorthands for such operations. They offer a shorter and 
# more readable way to create lists with various settings using just a single line of code.
#Syntax : <variable> = [<expression> for <item> in <iterable>]
values = [x for x in range(1,51)]
print(values)
# z = [1,2,3]
#Used for printing
# [print(i) for i in z]
list1 = [x+100 for x in range(10)]
print(list1)
list2 = [x+10 for x in range(10) if x%2==0]
print(list2)