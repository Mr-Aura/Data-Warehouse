'''
1. Lists are mutable.
2. Lists are indexed.
3. Lists are ordered.
4. In Lists, duplicate elements are allowed.
'''
#basic list creation and display
a = [10,20,30,40,50,"Hello"]
print("Displaying list:",a)
# checking type and memory location
print("\nUsing type to check class:",type(a))
print("\nChecking where the list is stored:",id(a))
#Indexing:
print("\nChecking backward indexing:",a[-1])
print("\nChecking index 1 value:",a[1])
#Slicing:
print("\nSlicing list from index 1 till end:",a[1:])
print("\nSlicing list from index till 4:",a[:4]) # here :4 means it will display value until 3rd index and will not display whatever is in 4th index
#concatenation:
b = [10,20,30,40]
c = [50,60,70]
print("\nConcatenating two lists:",b+c)
#traversal using for loop:
d = [10,20,30]
print("\nTraversal using for loop:",end=" ")
for i in d:
    print(i,end=" ")