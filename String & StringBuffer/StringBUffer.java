import java.util.*;
class StringBUffer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuffer s1 = new StringBuffer("Numair ");
        StringBuffer s2 = new StringBuffer();
        System.out.println("Enter the StringBuffer:");
        s2.append(sc.nextLine());
        sc.close();
        s2.setCharAt(3, 'm');
        System.out.println(s2);
        s1.insert(3,"Hey");
        System.out.println(s1);
    }
}
