from tkinter import *
def details():
    print(f"The username is {username_variable.get()}")
    print(f"The password is {password_variable.get()}")
root = Tk()
root.geometry("744x433")
username_variable = StringVar()
password_variable = StringVar()
label1 = Label(root,text="Username: ",font="lucida 10 bold")
label2 = Label(root,text="Password: ",font="lucida 10 bold")
entry1 = Entry(root,textvariable=username_variable)
entry2 = Entry(root,textvariable=password_variable,show="*")
label1.grid()
label2.grid(row=1)
entry1.grid(row=0,column=1)
entry2.grid(row=1,column=1)
button = Button(root,text="Submit",command=details)
button.grid(row = 2)
root.mainloop()