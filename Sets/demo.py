'''
1. Sets are mutable.
2. Sets are un-indexed.
3. Sets are unordered.
4. In sets, duplicate elements are not allowed.
'''
a = {10,20,30,40,50}
# print(a[1]) gives error as sets do not have index.
print(a) #it will not be printed in the order of 10,20,30,40,50. The order can be different. Thus proving that the sets are unordered.
a.add(40)# will not give error.
print(a)#It will simply show 40 once as duplicates are not allowed.