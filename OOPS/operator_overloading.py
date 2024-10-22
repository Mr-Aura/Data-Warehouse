class Vector:
    def __init__(self,i,j,k):
        self.i = i 
        self.j = j 
        self.k = k 
    def __str__(self):
        return f"{self.i}i+{self.j}j+{self.k}k"
    def __add__(self,x):
        return Vector(self.i+x.i,self.j+x.j,self.k+x.k) # this is used to display vector as type
vc1 = Vector(2,4,6)
vc2 = Vector(3,5,7)
print(vc1)
print(vc2)
print(vc1+vc2)
# print(type(vc1 + vc2)) output : <class '__main__.Vector'> & this is not important.