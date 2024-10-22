import java.util.*;

class add {
    public static void main(String args[]) {
        int a, b, c;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        a = t.nextInt();
        System.out.println("Enter the 2nd number:");
        b = t.nextInt();
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        t.close();
    }
}
