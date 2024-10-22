import java.util.*;
class total_words {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("Enter the string:");
        st = sc.next();
        int len = st.length();
        System.out.println("Total words in the string = "+len);
        sc.close();
    }
}