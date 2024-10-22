class vowel_or_consonant {
public static void main(String args[]) {
int vowel=0,consonant=0;
String st = "Hello";
for (int i = 0; i < st.length(); i++) {
    if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
    || st.charAt(i) == 'u' || st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I'
    || st.charAt(i) == 'O' || st.charAt(i) == 'U') {
    vowel++;   
    }
    else
    consonant++;
    }
    System.out.println("Number of Vowels = "+vowel);
    System.out.println("Number of Consonants = "+consonant);
    }
}
