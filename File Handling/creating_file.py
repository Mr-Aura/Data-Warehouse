try:
    with open("example.txt", "a") as file:
        file.write("\nHello, this is a sample text file created using Python.")
    print("File created and written successfully.")
except Exception as e:
    print("Failed to create the file. Error:", e)
    
#use "w" for writing mode. It will overwrite whatever was written before.
#use "a" for append mode. It will write at the end of file without deleting old content.