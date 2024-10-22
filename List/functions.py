a = [10,20,30,20,50,70,100,200]
print(a.count(20))
print(a.index(200))
b = a.copy()
print(b)
print(len(a))

#insertion functions

#1.append
a.append(300)
print(a)

#2.insert
a.insert(1,88)
print(a)

#3.extend
a.extend(b)
print(a)

#deletion functions

#1.remove
a.remove(88)
print(a)

#2.pop
a.pop(-3)
print(a)

#3.clear
a.clear()
print(a)

#del keyword
del a
# print(a) gives error as a was deleted.