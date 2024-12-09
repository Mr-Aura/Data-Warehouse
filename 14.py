try:
    filename = input("Enter the file name:")
    with open(filename,'r') as file:
        content = file.read()
        print(f"File content : {content}")
except FileNotFoundError:
    print("Error : File does not exist.")
except PermissionError:
    print("Error: You do not have permission to access this file.")
except IsADirectoryError:
    print("Error : Name provided is a directory, not a file.")
else:
    print("File read successfully.")
finally:
    print("File operation completed.")