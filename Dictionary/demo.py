'''
1.Ordered: Prior to Python 3.7, dictionaries were unordered collections. 
From Python 3.7 onwards, dictionaries are ordered collections, meaning they 
maintain the insertion order.
2.Mutable: You can change, add, or remove key-value pairs in a dictionary.
3.Indexed by Keys: Unlike sequences, which are indexed by numbers, 
dictionaries are indexed by keys.
4.Keys are Unique: A dictionary cannot have two items with the same key.
5.Keys must be Immutable: Keys can be strings, numbers, or tuples, 
but not lists or other dictionaries.
'''
a  = {'Name':'Kane','Age':31,'Profession':'Footballer',}
print(type(a))
print(a)