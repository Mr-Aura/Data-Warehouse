from tkinter import *
root = Tk()
root.geometry("150x200")
label = Label(root,text="BATMAN",font="comcisansms 50 bold").pack()
scrollbar = Scrollbar(root)
scrollbar.pack(side="right",fill="y")
mylist = Listbox(root,yscrollcommand=scrollbar.set)
for line in range(1,26):
    mylist.insert(END,"SUBJECT"+str(line))
mylist.pack(side="left",fill="y")
scrollbar.config(command=mylist.yview)
root.mainloop()