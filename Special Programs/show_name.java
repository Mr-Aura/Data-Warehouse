import java.util.*;

class show_name {
    public static void main(String args[]) {
        String name;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = t.nextLine();// next is like cin and it does not display name after space,
                            // whereas nextline is like getline function.
        System.out.println("Your name = " + name);
        t.close();
    }
}
