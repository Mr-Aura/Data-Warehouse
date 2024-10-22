'''
1. Tuples are immutable.
2. Tuples are indexed.
3. Tuples are ordered.
4. In tuples, duplicate elements are allowed.
'''
a = (10,20,30)
# b = (1) this is not tuple.
# b = (1,) this is tuple.
print(type(a))
print(a[1])
print(len(a))
# a[1] = 90 not allowed.
# print(a[1])  gives error as tuple is immutable.
#for insertion and deletion, we will use list functions. To use it we need to convert
#tuple into list.