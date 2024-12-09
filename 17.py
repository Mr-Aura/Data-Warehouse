from tkinter import *

root = Tk()

root.geometry("744x488")
label = Label(root,text="Hello World!",font="helvetica 16 bold")
label.pack()
message = Message(root,text="This is a message.")
message.pack()

root.mainloop()