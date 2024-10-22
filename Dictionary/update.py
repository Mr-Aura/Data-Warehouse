a = {
    "Language":"Python",
    "Creator":"Guido Van Rossum",
    "Extension":".py",
    "Version":3.11
}
#The argument for the update() function should be a dictionary, 
# meaning it should start with { and end with }
a.update({"Version":3.12})#update method can also be used to update value.
print(a["Version"])
#We can also dictionary with multiple items. If an item is new then it will be added to 
# the original dictionary.
b = {
    "Name":"John Wick",
    "Age":"41"
}
b.update({"Age":45,"Alias":"Baba Yaga"})
info = b.items()
print(info)