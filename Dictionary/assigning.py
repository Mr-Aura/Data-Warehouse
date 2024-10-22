dictionary = {
    "Team" : "Man City",
    "Stadium" : "Etihad Stadium",
    "Coach" : "Pep Guardiola",
    "Winner":"22/23"
}
dictionary["Winner"] = "23/24"
print(dictionary["Winner"])
#Value can be updated which means it is mutable.
dictionary["Captain"] = "KDB"
details = dictionary.items()
print(details)
#key and value can be assigned to the dictionary. Which means they are mutable.