from tkinter import *
root = Tk()
root.geometry("744x366")
var = StringVar(root,"0")
values = {
    "RadioButton 1" : "1",
    "RadioButton 2" : "2",
    "RadioButton 3" : "3",
    "RadioButton 4" : "4",
    "RadioButton 5" : "5",
}
for (text,value) in values.items():
    Radiobutton(root,text=text,value=value).pack()
root.mainloop()