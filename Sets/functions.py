#Remove elements from set
my_set = {1, 2, 3, 4, 5, 6}
my_set.remove(2)      # Removes the element 2
print(my_set)         # Output: {1, 3, 4, 5, 6}

my_set.discard(3)     # Removes the element 3
print(my_set)         # Output: {1, 4, 5, 6}

my_set.pop()          # Removes an arbitrary element
print(my_set)         # Output: {4, 5, 6}

my_set.clear()        # Removes all elements
print(my_set)         # Output: set()


#Insert elements in set
my_set = {1, 2, 3}
my_set.add(4)        # Adds a single element
print(my_set)        # Output: {1, 2, 3, 4}

my_set.update([5, 6]) # Adds multiple elements
print(my_set)         # Output: {1, 2, 3, 4, 5, 6}