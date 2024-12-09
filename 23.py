from tkinter import *
root = Tk()
root.geometry("755x488")
label = Label(root,text="CheckButton").pack()
var1 = IntVar()
var2 = IntVar()
var3 = IntVar()

cb1 = Checkbutton(root,variable=var1,text="Option 1").pack()
cb2 = Checkbutton(root,variable=var2,text="Option 2").pack()
cb3 = Checkbutton(root,variable=var3,text="Option 3").pack()
root.mainloop()