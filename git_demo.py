def number_generator(number):
    my_list = []
    for i in range(number):
        my_list.append(i)
    return my_list

def fibonacci_generator(number):
    my_list = []
    a = 0
    b = 1
    for i in range(number):
     my_list.append(a)
     c = a+b
     a = b
     b = c
    return my_list
     
print(fibonacci_generator(5))
print(number_generator(5))
print("How do i resolve conflict?")
