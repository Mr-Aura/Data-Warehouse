from tkinter import *
from tkinter import messagebox as msg
root = Tk()
root.geometry("744x466")
root.title("Login Form")
username = StringVar()
password = StringVar()
label = Label(root,text="Login Form",font="lucida 20 bold").pack()
label1 = Label(root,text="Username: ",font="comicsansms 15 bold").pack()
entry1 = Entry(root,textvariable=username).pack()
label2 = Label(root,text="Password: ",font="comicsansms 15 bold").pack()
entry2 = Entry(root,textvariable=password,show="*").pack()
var = IntVar()
cb1 = Checkbutton(root,text="Remember Me",variable=var).pack()
def verify():
    username_value = username.get()
    password_value = password.get()
    if username_value == "" or password_value=="":
        msg.showerror("Error","Both fields are required.")
    else:
        msg.showinfo("Welcome" ,f"Welcome {username_value}!")
        
submit = Button(root,text="Submit",command=verify).pack()
root.mainloop()