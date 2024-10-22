import java.util.Scanner;

class fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, c;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = t.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;
        }
        t.close();
    }
}
