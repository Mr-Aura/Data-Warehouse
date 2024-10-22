print("Prime numbers from 10 to 100:")
for i in range(10,101):
    count=0
    for j in range(2,i):
        if i % j==0:
            count+=1
            break
    if count==0:
        print(i,end=" ")