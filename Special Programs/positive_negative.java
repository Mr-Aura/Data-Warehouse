import java.util.*;

class positive_negative {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = t.nextInt();
        if (n > 0)
            System.out.println(n + " is postive.");
        else if (n == 0)
            System.out.println(n + " is zero.");
        else
            System.out.println(n + " is negative.");
        t.close();
    }
}
