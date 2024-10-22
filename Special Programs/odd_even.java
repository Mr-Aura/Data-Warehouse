import java.util.*;

class odd_even {
    public static void main(String args[]) {
        int n;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number to check if it is odd or even:");
        n = t.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is even number.");
        else
            System.out.println(n + " is odd number.");
        t.close();
    }
}
