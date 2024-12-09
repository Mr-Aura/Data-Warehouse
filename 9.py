class India():
    def language(self):
        print("Hindi is mostly spoken in India.")
    def capital(self):
        print("New Delhi.")
    def type(self):
        print("Developing country...")
class USA():
    def language(self):
        print("English is widely spoken in USA.")
    def capital(self):
        print("Washington DC is the capital of USA.")
    def type(self):
        print("USA is a developed country.")

obj_India = India()
obj_USA = USA()

for countries in (obj_India,obj_USA):
    countries.capital()
    countries.language()
    countries.type()