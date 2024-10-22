#for small files and inefficient for large files.
with open("example.txt", "r") as file:
    content = file.read()
    print(content)
#this method is used to read large files without loading the entire content into the memory
#at once. We should use this method if the file is very large.
# with open("example.txt", "r") as file:
#     for line in file:
#         print(line.strip())  # `.strip()` removes any extra newline characters