from tkinter import *
root = Tk()
root.geometry("755x345")
label = Label(root,text="This is a label.")
label.pack(pady=20)
def button_function():
    root.destroy()
button = Button(root,text="Close",command=button_function)
button.pack(pady=50)
root.mainloop()