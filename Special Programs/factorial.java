import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int fact = 1, n;
        System.out.println("ENTER THE NUMBER:");
        n = t.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        t.close();
    }
}
