#pop() removes item with the specified key name. It accepts the key to be removed
# as argument
a = {
    "Name":"John Wick",
    "Age":45,
    "Alias":"Baba Yaga"
}
a.pop("Alias")
print(a)