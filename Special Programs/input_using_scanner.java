import java.util.*;

class input_using_scanner {
    public static void main(String args[]) {
        int a;
        System.out.println("Enter the number:\n");
        Scanner t = new Scanner(System.in);
        a = t.nextInt();
        System.out.println("Value of a = " + a);
        t.close();
    }
}
