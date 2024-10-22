import java.util.*;

class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st;//Best way
        System.out.println("Enter your name:");
        st = sc.nextLine();
        System.out.println("Your name is " + st);
        String s = new String();//Not an efficient way
        System.out.println("Enter your name:");
        s = sc.nextLine();
        System.out.println("Your name is " + s);
        sc.close();
    }
}