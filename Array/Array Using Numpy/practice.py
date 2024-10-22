import numpy as obj
import pandas as pd
arr = obj.array([1,2,3,4])
x = arr[[True,False,False,True]]
print(x)
d = [1,7,2]
var = pd.Series(d)
print(var[1])