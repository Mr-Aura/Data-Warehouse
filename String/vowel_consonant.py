vowel = consonant = 0
str = input("Enter a string to check vowel and consonant:")
for i in range(0,len(str)):
    if str[i]=='a' or str[i]=='e' or str[i]=='i' or str[i]=='o' or str[i]=='u' or str[i]=='A' or str[i]=='E' or str[i]=='I' or str[i]=='O' or str[i]=='U':
        vowel = vowel + 1
    else:
        consonant = consonant + 1
print("Number of vowel =",vowel)
print("Number of consonant =",consonant)