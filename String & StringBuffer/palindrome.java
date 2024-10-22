import java.util.*;
class palindrome {
    public static void main(String args[]){
        String st;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        st = sc.next();
        sc.close();
        int i=0,j=st.length()-1,flag=0;
        while(i<j && flag==0){
        if(st.charAt(i)!=st.charAt(j))
        flag++;
        i++;
        j--;
        }
        if(flag==0)
        System.out.println(st+" is palindrome.");
        else
        System.out.println(st+" is not palindrome.");
    }
}