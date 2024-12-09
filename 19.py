from tkinter import *
root = Tk()
root.title("Test App")
root.geometry("200x100")
label = Label(root,text="This is a test",font="lucida 16 bold")
label.pack()
def greet():
    print("hello")
button = Button(root,text="Close",command=greet)
button.pack(pady=20)
root.mainloop()